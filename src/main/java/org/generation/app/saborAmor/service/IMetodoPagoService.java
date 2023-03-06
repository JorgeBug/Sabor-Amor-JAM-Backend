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
	MetodoPago updateMetodoPago(MetodoPago metodoPago);

	//Borrar método de pago
    public String deleteProductoByNumTarjeta(String numTarjeta);
    
    //Todos los métodos de pago
    List<MetodoPago> getAllMetodoPago(int idTarjeta);
}
