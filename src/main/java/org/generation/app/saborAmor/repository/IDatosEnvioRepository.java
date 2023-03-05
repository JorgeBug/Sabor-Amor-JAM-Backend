package org.generation.app.saborAmor.repository;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;
import org.springframework.data.repository.CrudRepository;

public interface IDatosEnvioRepository extends CrudRepository<DatosEnvio,Integer> {
	
	List<DatosEnvio> findAllDatosEnvioByFkIdUsuarioIdUsuario(int idUsuario);
}
