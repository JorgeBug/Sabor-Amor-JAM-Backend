package org.generation.app.saborAmor;

import org.generation.app.saborAmor.model.Carrito;
import org.generation.app.saborAmor.model.Usuario;
import org.generation.app.saborAmor.service.CarritoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SaborAmorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaborAmorApplication.class, args);
	}

//	@Bean
//	public void pruebita(){
//		CarritoService carritoService = new CarritoService();
//
//		//Crear usuario
//		Usuario usuario = new Usuario("Pedro","Perez","test@gmail.com",
//		"555555","pwd");
//
//		Carrito carrito = new Carrito(usuario);
//		carritoService.guardarAlgoEnCarrito(carrito);
//	}

}
