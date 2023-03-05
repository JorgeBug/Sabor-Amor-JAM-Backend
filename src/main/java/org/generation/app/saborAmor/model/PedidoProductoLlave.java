package org.generation.app.saborAmor.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PedidoProductoLlave  implements Serializable {

    @Column(name = "pedido_id")
    private int pedidoId;

    @Column(name = "producto_id")
    private int productoId;

    public PedidoProductoLlave() {

    }

}