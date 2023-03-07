package org.generation.app.saborAmor.repository;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;
import org.springframework.data.repository.CrudRepository;

public interface IDatosEnvioRepository extends CrudRepository<DatosEnvio,Integer> {
	
	//Buscar mediante el idUsuario
	List<DatosEnvio> findAllDatosEnvioByFkIdUsuarioIdUsuario(int idUsuario);
	
	//Buscar mediante correo
	List<DatosEnvio> findAllDatosEnvioByFkIdUsuarioEmail(String email);
	
	
}
