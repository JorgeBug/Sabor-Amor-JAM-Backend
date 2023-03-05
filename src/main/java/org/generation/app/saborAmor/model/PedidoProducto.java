package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido_producto")
public class PedidoProducto {

    @EmbeddedId
    private PedidoProductoLlave pedidoProductoLlave;

    @ManyToOne
    @MapsId("pedidoId")
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    public PedidoProducto() {

    }

}
