package org.generation.app.saborAmor.controller;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;
import org.generation.app.saborAmor.service.IDatosEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DatosEnvioController {

    @Autowired
    IDatosEnvioService datosEnvioService;


    @GetMapping("/datos-envio/{id}")
    public List<DatosEnvio> getAllDatosEnvioByIdUsuario(@PathVariable("id") int idUsuario){
        return datosEnvioService.getAllMetodosPagoByFkIdUsuario(idUsuario);
    }

}