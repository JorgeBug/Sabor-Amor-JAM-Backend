package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Usuario;
import org.generation.app.saborAmor.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    IUsuarioService usuarioService;



    @GetMapping("/test")
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }


}
