package org.generation.app.saborAmor.repository;

import org.generation.app.saborAmor.model.PedidoProducto;
import org.generation.app.saborAmor.model.PedidoProductoLlave;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPedidoProductoRepository extends CrudRepository<PedidoProducto,PedidoProductoLlave> {


    public List<PedidoProducto> findAllByPedidoId(int pedidoId);



}
