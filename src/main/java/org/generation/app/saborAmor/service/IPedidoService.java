package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.Pedido;
import org.generation.app.saborAmor.model.PedidoProducto;

import java.util.List;

public interface IPedidoService {

    public List<Pedido> getAllPedidosByUsuarioId(int idUsuario);

    public List<Pedido> getAllPedidoProductoByPedidoId(int idPedido);

    public Pedido savePedido(Pedido pedido);





}
