package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.Pedido;

import java.util.List;

public interface IPedidoService {

    public List<Pedido> getAllPedidosByFkIdUsuario(int idUsuario);





}
