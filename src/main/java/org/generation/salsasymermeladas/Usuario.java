package org.generation.salsasymermeladas;

import jakarta.persistence.*;


@Entity
@Table(name="Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int idUsuario;

    @Column(name="nombre")
    private String nombre;

    private String apellido;

    private String email;

    private String telefono;

    protected Usuario(){
    }

    public Usuario(String nombre,String apellido,String email,String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return String.format("Nombre del cliente %s",this.nombre);
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
        apellido = apellido;
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
}
