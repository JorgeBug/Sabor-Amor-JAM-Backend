package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.Pedido;
import org.generation.app.saborAmor.model.PedidoProducto;
import org.generation.app.saborAmor.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements IPedidoService {

    @Autowired
    IPedidoRepository pedidoRepository;


    @Override
    public List<Pedido> getAllPedidosByUsuarioId(int idUsuario) {
        return pedidoRepository.findAllByUsuarioIdIdUsuario(idUsuario);
    }

    @Override
    public List<Pedido> getAllPedidoProductoByPedidoId(int idPedido) {
        return pedidoRepository.findAllPedidosById(idPedido);
    }

    @Override
    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}