package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

@Entity
public class DatosEnvio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnvio;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String calle;

    @Column(nullable = false)
    private String numExterior;

    private String interior;

    @Column(nullable = false)
    private int cp;

    @Column(nullable = false)
    private String colonia;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String municipio;

    @ManyToOne
    @JoinColumn(name = "fk_idUsuario")
    private Usuario fkIdUsuario;

    protected DatosEnvio() {

    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }


}