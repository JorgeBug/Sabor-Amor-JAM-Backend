package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Embeddable
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPedido;

    @Column( nullable = false)
    private String fechaPedido;

    private String fechaEntrega;

    @Column( nullable = false)
    private int monto;

    @ManyToOne
    @JoinColumn(name="fk_idUsuario")
    private Usuario fkIdUsuario;



    protected Pedido() {

    }

    public Pedido(String fechaPedido, String fechaEntrega, int monto, int carritoIdCarrito) {
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.monto = monto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }



}