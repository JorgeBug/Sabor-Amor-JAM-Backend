package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    IProductService productService;


    @GetMapping("/catalogo") //localhost:8080/catalogo
    public List<Producto> getAllProductos(){
        return productService.getAllProductos();
    }









}
