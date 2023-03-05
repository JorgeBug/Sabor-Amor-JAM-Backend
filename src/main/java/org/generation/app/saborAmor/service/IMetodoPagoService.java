package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;

public interface IMetodoPagoService {
	
	public List<MetodoPago> getAllMetodosPagoByFkIdUsuario(int idUsuario);

}
