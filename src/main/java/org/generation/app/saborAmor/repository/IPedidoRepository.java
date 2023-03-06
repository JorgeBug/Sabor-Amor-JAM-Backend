package org.generation.app.saborAmor.repository;

import org.generation.app.saborAmor.model.Pedido;
import org.generation.app.saborAmor.model.PedidoProducto;
import org.generation.app.saborAmor.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPedidoRepository extends CrudRepository<Pedido,Integer> {

   List<Pedido> findAllByUsuarioIdIdUsuario(int usuarioId);

   Pedido findById(int pedidoId);

   List<Pedido> findAllPedidosById(int pedidoId);



}
