package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.PedidoProducto;

import java.util.List;

public interface IPedidoProductoService {

    public List<PedidoProducto> getAllPedidoProductoByPedidoId(int pedidoId);


}
