package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Usuario;
import org.generation.app.saborAmor.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
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

    @PutMapping("usuarios")
    public ResponseEntity<?> updateCustomer(@RequestBody Usuario customer ){
        try {
            return new ResponseEntity<Usuario>(
                    usuarioService.updateUsuario(customer),
                    HttpStatus.CREATED);

        } catch (IllegalStateException e) {
            return new ResponseEntity<String>(e.getMessage() , HttpStatus.BAD_REQUEST );
        }
    }

    @DeleteMapping("usuarios/{id}") //localhost:8080/api/customers/2
    public ResponseEntity<?> deleteCustomerById(@PathVariable("id") int idCustomer) {
        try {
            return new ResponseEntity<String>(
                    usuarioService.deleteUsuarioById(idCustomer),
                    HttpStatus.OK);
        } catch (IllegalStateException e) {
            return new ResponseEntity<String>(e.getMessage() , HttpStatus.NOT_FOUND );
        }
    }

}
