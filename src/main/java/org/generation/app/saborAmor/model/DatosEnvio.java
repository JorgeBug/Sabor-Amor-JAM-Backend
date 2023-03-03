package org.generation.app.saborAmor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DatosEnvio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnvio;

    private String nombre;

    private String apellido;

    private String calle;

    private String numExterior;

    private String interior;

    private int cp;

    private String colonia;

    private String estado;

    private String municipio;

    private int usuarioIdUsuario;

    protected DatosEnvio() {

    }

    public DatosEnvio(String nombre, String apellido, String calle, String numExterior, String interior, int cp,
                      String colonia, String estado, String municipio, int usuarioIdUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.numExterior = numExterior;
        this.interior = interior;
        this.cp = cp;
        this.colonia = colonia;
        this.estado = estado;
        this.municipio = municipio;
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

    public int getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(int usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }


}