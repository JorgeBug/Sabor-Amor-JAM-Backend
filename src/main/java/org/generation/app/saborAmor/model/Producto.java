package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Embeddable
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProducto;

    @Column( nullable = false)
    private String nombre;

    @Column( nullable = false)
    private int precio;

    @Column( nullable = false)
    private int contenido;

    @Column( nullable = false)
    private String descripcion;

    @Column( nullable = false)
    private String imgLink;

    @Column( nullable = false)
    private String spicy;

    @Column ( nullable = false)
    private String categoria;

    @OneToMany(mappedBy = "producto")
    private Set<PedidoProducto> pedidos = new HashSet<>();

    protected Producto() {

    }

    public Producto(String nombre, int precio, int contenido, String descripcion, String imgLink) {
        this.nombre = nombre;
        this.precio = precio;
        this.contenido = contenido;
        this.descripcion = descripcion;
        this.imgLink = imgLink;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}