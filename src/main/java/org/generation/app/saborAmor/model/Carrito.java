package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCarrito;

    @OneToOne
    @JoinColumn(name="fk_idUsuario")
    private Usuario fkIdUsuario;

    protected Carrito() {

    }


    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }



}