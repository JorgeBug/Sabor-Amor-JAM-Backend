package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.generation.app.saborAmor.model.Producto;

public interface IMetodoPagoService {
	
	public List<MetodoPago> getAllMetodosPagoByFkIdUsuario(int idUsuario);
	
	public List<MetodoPago> getAllMetodosPagoByEmail(String email);
	
	//Agregar método pago
	MetodoPago setMetodoPago(MetodoPago metodoPago);

    MetodoPago updateMetodoPago(MetodoPago metodoPago);

    String deleteProductoByNumTarjeta(String numTarjeta);
    
    MetodoPago getMetodoPagoById(int idTarjeta);
}
