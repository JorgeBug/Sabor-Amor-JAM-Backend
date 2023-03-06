package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.Pedido;
import org.generation.app.saborAmor.model.PedidoProducto;
import org.generation.app.saborAmor.repository.IPedidoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoProductoService implements IPedidoProductoService {

    @Autowired
    IPedidoProductoRepository pedidoProductoRepository;


    @Override
    public List<PedidoProducto> getAllPedidoProductoByPedidoId(int pedidoId) {
        return pedidoProductoRepository.findAllByPedidoId(pedidoId);
    }
}
