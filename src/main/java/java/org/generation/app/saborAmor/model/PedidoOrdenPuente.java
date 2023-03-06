package org.generation.app.saborAmor.model;

import jakarta.persistence.*;


@Entity
public class PedidoOrdenPuente {

    @Id
    @ManyToOne
    Producto producto;

    @Id
    @ManyToOne
    Pedido pedido;

    int cantidad;

    protected PedidoOrdenPuente(){

    }

    public Producto getProductoId() {
        return producto;
    }

    public void setProductoId(Producto productoId) {
        this.producto = productoId;
    }

    public Pedido getPedidoId() {
        return pedido;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedido = pedidoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
