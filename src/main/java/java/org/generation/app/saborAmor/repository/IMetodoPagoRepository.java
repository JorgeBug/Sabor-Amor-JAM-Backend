package org.generation.app.saborAmor.repository;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.springframework.data.repository.CrudRepository;

public interface IMetodoPagoRepository extends CrudRepository<MetodoPago,Integer> {
	
	List<MetodoPago> findAllMetodoPagoByFkIdUsuarioIdUsuario(int idUsuario);
	
	List<MetodoPago> findAllMetodoPagoByFkIdUsuarioEmail(String Email);
	
	boolean existsByNumTarjeta(String numTarjeta);
	
}


