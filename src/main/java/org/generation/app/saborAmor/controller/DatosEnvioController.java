package org.generation.app.saborAmor.controller;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;
import org.generation.app.saborAmor.service.IDatosEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DatosEnvioController {
	
	@Autowired
    IDatosEnvioService datosEnvioService;


    @GetMapping("/datos-envio/{id}")
    public List<DatosEnvio> getAllDatosEnvioByIdUsuario(@PathVariable("id") int idUsuario){
        return datosEnvioService.getAllDatosEnvioByFkIdUsuario(idUsuario);
    }
    
    @GetMapping("/datos-envio/email/{correo}")
    public List<DatosEnvio> getAllDatosEnvioByEmail(@PathVariable("correo") String email){
        return datosEnvioService.getAllDatosEnvioByEmail(email);
    }
    
    @GetMapping("/datos-envio")
    public List<DatosEnvio> getAllDatosEnvioIdUsuarioGetAll(){
        return datosEnvioService.getAllDatosEnvio();
    }
    
    @DeleteMapping("/datos-envio/{idEnvio}")
    public ResponseEntity<?> deleteDatosEnvioById(@PathVariable("idEnvio") int idEnvio){
        try {
            return new ResponseEntity<Integer>(
            		datosEnvioService.deleteDatosEnvioByIdEnvio(idEnvio),
                    HttpStatus.OK);
        } catch (IllegalStateException e) {
            return new ResponseEntity<String>(e.getMessage() , HttpStatus.NOT_FOUND );
        }
    }
    
    @PostMapping("/datos-envio")
    public DatosEnvio saveDatosEnvio(@RequestBody DatosEnvio datosEnvio) {
    	return datosEnvioService.saveDatosEnvio(datosEnvio);
    }
    
    @PutMapping("/datos-envio")
    public DatosEnvio updatedatosEnvioExiteById(@RequestBody DatosEnvio newDatosEnvio) {
    	return datosEnvioService.updateDatosEnvio(newDatosEnvio);
    }

}