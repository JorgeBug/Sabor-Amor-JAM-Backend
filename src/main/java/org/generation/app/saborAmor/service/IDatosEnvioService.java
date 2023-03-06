package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;

public interface IDatosEnvioService {

	
	//Obtener
	public List<DatosEnvio> getAllDatosEnvioByFkIdUsuario(int idUsuario);
	
	
	
	public List<DatosEnvio> getAllDatosEnvioByEmail(String email);
	
	public List<DatosEnvio> getAllDatosEnvio();
	
	public int deleteDatosEnvioByIdEnvio(int idEnvio);

	public DatosEnvio getDatosEnvioByIdEnvio(int idEnvio);
	
	public DatosEnvio saveDatosEnvio(DatosEnvio datosEnvio);
	
	public DatosEnvio updateDatosEnvio(DatosEnvio datosEnvio);
	
	public boolean datoEnvioExiteById(int idEnvio);
}
