package org.generation.app.saborAmor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column( nullable = false)
    private String fechaPedido;

    private String fechaEntrega;

    @Column( nullable = false)
    private int monto;

    @OneToMany(mappedBy = "pedido")
    private Set<PedidoProducto> pedidos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuarioId;



    protected Pedido() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Set<PedidoProducto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<PedidoProducto> pedidos) {
        this.pedidos = pedidos;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }
}