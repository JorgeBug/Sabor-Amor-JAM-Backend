package org.generation.app.saborAmor.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "pedido_producto")
public class PedidoProducto {

    @EmbeddedId
    private PedidoProductoLlave pedidoProductoLlave;

    @ManyToOne
    @MapsId("pedidoId")
    @JoinColumn(name = "id_pedido")
    @JsonBackReference
    private Pedido pedido;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    public PedidoProducto() {

    }

    public PedidoProductoLlave getPedidoProductoLlave() {
        return pedidoProductoLlave;
    }

    public void setPedidoProductoLlave(PedidoProductoLlave pedidoProductoLlave) {
        this.pedidoProductoLlave = pedidoProductoLlave;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
