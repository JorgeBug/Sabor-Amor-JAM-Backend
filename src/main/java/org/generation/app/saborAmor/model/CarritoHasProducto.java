//package org.generation.app.saborAmor.model;
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//
//
//@Embeddable
//public class CarritoHasProducto implements Serializable {
//
//    @ManyToOne
//    @JoinColumn(name = "Carrito_idCarrito")
//    private Carrito carrito;
//
//    @ManyToOne
//    @JoinColumn(name = "Producto_IdProducto")
//    private Producto producto;
//
//    // getters y setters
//}