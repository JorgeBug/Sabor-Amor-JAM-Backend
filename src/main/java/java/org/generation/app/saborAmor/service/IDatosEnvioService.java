package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;

public interface IDatosEnvioService {

	public List<DatosEnvio> getAllDatosEnvioByFkIdUsuario(int idUsuario);
	
	public List<DatosEnvio> getAllDatosEnvio();

}
