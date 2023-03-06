package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.repository.IMetodoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetodoPagoService implements IMetodoPagoService {

    @Autowired
    IMetodoPagoRepository metodoRepository;

    @Override
    public List<MetodoPago> getAllMetodosPagoByFkIdUsuario(int idUsuario) {
        return metodoRepository.findAllMetodosPagoByFkIdUsuarioIdUsuario(idUsuario);
    }

    @Override
    public List<MetodoPago> getAllMetodosPagoByEmail(String email) {
        return metodoRepository.findAllMetodosPagoByFkIdUsuarioEmail(email);
    }

    @Override
    public boolean existMetodoPagoByNumTarjeta(String numTarjeta) {
        return metodoRepository.existsByNumTarjeta(numTarjeta);
    }

    @Override
    public MetodoPago setMetodoPago(MetodoPago metodoPago) {
        if (existMetodoPagoByNumTarjeta(metodoPago.getNumTarjeta()))
            throw new IllegalStateException("The user already exists with that card number: " + metodoPago.getNumTarjeta());

        MetodoPago newMetodoPago = metodoPago;
        newMetodoPago.setIdTarjeta(0);

        return metodoRepository.save(newMetodoPago);
    }

    @Override
    public MetodoPago updateMetodoPago(MetodoPago newMetodoPago) {
        if (!existMetodoPagoByNumTarjeta(newMetodoPago.getNumTarjeta()))
            throw new IllegalStateException("The product with number card: " + newMetodoPago.getNumTarjeta() + " doesn't exist");

        MetodoPago metodoPago = getMetodoPagoById(newMetodoPago.getIdTarjeta());
        updateMetodo(newMetodoPago, metodoPago);

        metodoRepository.save(metodoPago);
        return metodoPago;
    }

    @Override
    public MetodoPago getMetodoPagoById(int idTarjeta) {
        return metodoRepository.findById(idTarjeta)
                .orElseThrow(() ->
                        new IllegalStateException("Payment method does not exist with id: " + idTarjeta));
    }

    @Override
    public List<MetodoPago> getAllMetodoPago() {
        return (List<MetodoPago>) metodoRepository.findAll();
    }

    //Grabs all the attributes of the first product and uses them
    //to update the second one.
    private void updateMetodo(MetodoPago newMetodoPago, MetodoPago metodoPago) {
        metodoPago.setNumTarjeta(newMetodoPago.getNumTarjeta());
        metodoPago.setTitularTarjeta(newMetodoPago.getTitularTarjeta());
        metodoPago.setCvv(newMetodoPago.getCvv());
        metodoPago.setFechaDeExpiracion(newMetodoPago.getFechaDeExpiracion());
        metodoPago.setFkIdUsuario(metodoPago.getFkIdUsuario());
    }

    @Override
    public int deleteMetodoByIdTarjeta(int idTarjeta) {
        MetodoPago metodoPago = getMetodoPagoById(idTarjeta);
        metodoRepository.deleteById(idTarjeta);
        return idTarjeta;
    }

}