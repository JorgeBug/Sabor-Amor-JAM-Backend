package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Usuario;
import org.generation.app.saborAmor.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    IUsuarioService usuarioService;


    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }

    @PostMapping("usuarios")
    public ResponseEntity<?> setNewUsuario(@RequestBody Usuario usuario) {
        try {
            return new ResponseEntity<Usuario>(
                    usuarioService.setUsuario(usuario),
                    HttpStatus.CREATED);

        } catch (IllegalStateException e) {
            return new ResponseEntity<String>(e.getMessage() , HttpStatus.BAD_REQUEST );
        }

    }

}
