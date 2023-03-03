package org.generation.app.saborAmor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MetodoPago {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String numTarjeta;

    private String titularTarjeta;

    private String banco;

    private int usuarioIdUsuario;

    //Constructor por default
    protected MetodoPago() {

    }

    public MetodoPago(String numTarjeta, String titularTarjeta, String banco, int usuarioIdUsuario) {
        super();
        this.numTarjeta = numTarjeta;
        this.titularTarjeta = titularTarjeta;
        this.banco = banco;
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getTitularTarjeta() {
        return titularTarjeta;
    }

    public void setTitularTarjeta(String titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(int usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Método de pago del usuario " + titularTarjeta;
    }

}