package org.generation.app.saborAmor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPedido;

    private String fechaPedido;

    private String fechaEntrega;

    private int monto;

    private int carritoIdCarrito;

    protected Pedido() {

    }

    public Pedido(String fechaPedido, String fechaEntrega, int monto, int carritoIdCarrito) {
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.monto = monto;
        this.carritoIdCarrito = carritoIdCarrito;
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

    public int getCarritoIdCarrito() {
        return carritoIdCarrito;
    }

    public void setCarritoIdCarrito(int carritoIdCarrito) {
        this.carritoIdCarrito = carritoIdCarrito;
    }


}