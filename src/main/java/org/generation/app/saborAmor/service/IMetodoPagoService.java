package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.generation.app.saborAmor.model.Producto;

public interface IMetodoPagoService {

    public List<MetodoPago> getAllMetodosPagoByFkIdUsuario(int idUsuario);

    public List<MetodoPago> getAllMetodosPagoByEmail(String email);

    //Agregar método pago
    public MetodoPago setMetodoPago(MetodoPago metodoPago);
    public boolean existMetodoPagoByNumTarjeta(String numTarjeta);

    //Actualizar método de pago
    public MetodoPago updateMetodoPago(MetodoPago metodoPago);
    public MetodoPago getMetodoPagoById(int idTarjeta);

    //Borrar método de pago
    public int deleteMetodoByIdTarjeta(int idTarjeta);

    //Todos los métodos de pago
    List<MetodoPago> getAllMetodoPago();

}