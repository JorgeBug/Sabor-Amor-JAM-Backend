package org.generation.app.saborAmor.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    public static final int FIELD_MAX_LENGTH = 160;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int idUsuario;

    @Column(nullable = false)
    private String nombre;

    @Column( nullable = false)
    private String apellido;

    @Column(unique=true, nullable = false)
    private String email;

    @Column( nullable = false)
    private String telefono;

    @Column( nullable = false)
    private String contrasenia;

    protected Usuario(){

    }

    public Usuario(String nombre, String apellido, String email, String telefono, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }


    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getContrasenia() {
        return contrasenia;
    }


    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    @Override
    public String toString() {
        return "Encontré un usuario con los datos " + this.nombre;
    }
}