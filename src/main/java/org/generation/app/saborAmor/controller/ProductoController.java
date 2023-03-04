package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    IProductService productService;


    @GetMapping("/catalogo") //localhost:8080/catalogo
    public List<Producto> getAllProductos(){
        return productService.getAllProductos();
    }

    @GetMapping("/catalogo/{categoria}") //localhost:8080/catalogo/salsa
    public List<Producto> getProductByCategory(@PathVariable("categoria") String categoria){
        return productService.findAllByCategoria(categoria);
    }

    @PostMapping("/catalogo")
    public Producto saveProduct(@RequestBody Producto producto){
        return productService.saveProducto(producto);

    }

    @PutMapping("/catalogo")
    public Producto updateProduct(){
        //
    }









}
