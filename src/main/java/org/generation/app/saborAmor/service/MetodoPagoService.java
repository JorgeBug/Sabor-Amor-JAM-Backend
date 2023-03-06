package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.repository.IMetodoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetodoPagoService implements IMetodoPagoService{
	
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

	/*@Override
	public MetodoPago setMetodoPago(MetodoPago metodoPago) {
		return metodoRepository.save(metodoPago);
	}*/

	@Override
	public MetodoPago setMetodoPago(MetodoPago metodoPago) {
		if ( existMetodoPagoByNumTarjeta(metodoPago.getNumTarjeta()))
			throw new IllegalStateException("The user already exists with that card number: " + metodoPago.getNumTarjeta() );
	
		MetodoPago newMetodoPago = metodoPago;
		newMetodoPago.setIdTarjeta(0);
		
		return metodoRepository.save(newMetodoPago);
	}

	@Override
	public MetodoPago updateMetodoPago(MetodoPago metodoPago) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProductoByNumTarjeta(String numTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existMetodoPagoByNumTarjeta(String numTarjeta) {
		return metodoRepository.existsByNumTarjeta(numTarjeta);
	}

	@Override
	public List<MetodoPago> getAllMetodoPago(int idTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
