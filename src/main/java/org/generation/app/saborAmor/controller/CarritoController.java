package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Carrito;
import org.generation.app.saborAmor.service.ICarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class CarritoController {

    @Autowired
    ICarritoService carritoService;



    @GetMapping("/carritos")
    public List<Carrito> getAllCarritos(){
        return  carritoService.getAllCarritos();
    }



}
