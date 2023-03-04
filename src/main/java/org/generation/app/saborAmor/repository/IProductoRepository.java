package org.generation.app.saborAmor.repository;

import org.generation.app.saborAmor.model.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductoRepository extends CrudRepository<Producto,Integer> {

    List<Producto> findAllByCategoria(String categoria);


}
