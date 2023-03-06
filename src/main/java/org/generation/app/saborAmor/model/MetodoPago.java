package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

@Entity
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;

    @Column(unique = true, nullable = false)
    private String numTarjeta;

    @Column(nullable = false)
    private String titularTarjeta;

    @Column(nullable = false)
    private int cvv;

    @Column(nullable = false)
    private String fechaDeExpiracion;

    @ManyToOne
    @JoinColumn(name = "fk_id_usario", nullable = true)
    private Usuario fkIdUsuario;

    //Constructor por default
    protected MetodoPago() {

    }

    public MetodoPago(String numTarjeta, String titularTarjeta, int cvv, String fechaDeExpiracion,
                      Usuario fkIdUsuario) {
        this.numTarjeta = numTarjeta;
        this.titularTarjeta = titularTarjeta;
        this.cvv = cvv;
        this.fechaDeExpiracion = fechaDeExpiracion;
        this.fkIdUsuario = fkIdUsuario;
    }

    //Getter y setter
    public int getIdTarjeta() {
        return idTarjeta;
    }


    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
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


    public int getCvv() {
        return cvv;
    }


    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


    public String getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }


    public void setFechaDeExpiracion(String fechaDeExpiracion) {
        this.fechaDeExpiracion = fechaDeExpiracion;
    }


    public Usuario getFkIdUsuario() {
        return fkIdUsuario;
    }


    public void setFkIdUsuario(Usuario fkIdUsuario) {
        this.fkIdUsuario = fkIdUsuario;
    }


    @Override
    public String toString() {
        return "Método de pago del usuario " + titularTarjeta;
    }

}