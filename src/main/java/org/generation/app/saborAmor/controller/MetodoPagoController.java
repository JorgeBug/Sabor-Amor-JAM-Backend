package org.generation.app.saborAmor.controller;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.service.IMetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MetodoPagoController {
	
	@Autowired
    IMetodoPagoService metodoPagoService;


    @GetMapping("/metodo-pago/{id}")
    public List<MetodoPago> getAllMetodosPagoByFkIdCustomer(@PathVariable("id") int idUsuario){
        return metodoPagoService.getAllMetodosPagoByFkIdUsuario(idUsuario);
    }
    
    @GetMapping("/metodo-pago/email/{email}")
    public List<MetodoPago> getAllMetodosPagoByEmail(@PathVariable("email") String email){
        return metodoPagoService.getAllMetodosPagoByEmail(email);
    }
    
    @PostMapping("/metodo-pago")
    public MetodoPago saveMetodo(@RequestBody MetodoPago metodopago){
        return metodoPagoService.setMetodoPago(metodopago);

    }
    
}
