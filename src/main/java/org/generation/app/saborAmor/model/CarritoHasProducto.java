//package org.generation.app.saborAmor.model;
//
//import jakarta.persistence.*;
//
//@Entity
//public class CarritoHasProducto {
//
//    @Column(nullable = false)
//    private int cantidad;
//
//
//    @ManyToOne
//    @JoinColumn(name="fk_id_carrito")
//    private Carrito fkIdCarrito;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name="fk_id_producto")
//    private Producto fkIdProducto;
//
//    protected CarritoHasProducto(){
//
//    }
//
//}
