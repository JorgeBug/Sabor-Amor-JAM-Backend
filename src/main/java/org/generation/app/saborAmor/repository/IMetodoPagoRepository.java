package org.generation.app.saborAmor.repository;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.springframework.data.repository.CrudRepository;

public interface IMetodoPagoRepository extends CrudRepository<MetodoPago,Integer> {

    List<MetodoPago> findAllMetodosPagoByFkIdUsuarioIdUsuario(int idUsuario);

    List<MetodoPago> findAllMetodosPagoByFkIdUsuarioEmail(String email);

    boolean existsByNumTarjeta(String numTarjeta);

}
