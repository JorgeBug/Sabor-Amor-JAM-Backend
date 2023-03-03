package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Carrito;
import org.generation.app.saborAmor.service.ICarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarritoController {

    @Autowired
    ICarritoService carritoService;



    @GetMapping("/carritos")
    public List<Carrito> getAllCarritos(){
        return  carritoService.getAllCarritos();
    }



}
