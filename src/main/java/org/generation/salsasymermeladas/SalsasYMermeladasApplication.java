package org.generation.salsasymermeladas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@SpringBootApplication
public class SalsasYMermeladasApplication {

	private static final Logger log = LoggerFactory.getLogger(SalsasYMermeladasApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SalsasYMermeladasApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UsuarioRepository repository) {
		return (args) -> {

//			repository.save(new Usuario("RODRIGO", "RODRIGUEZ","rodrigo.gmail.com","5555555"));

//			List<Usuario> misUsuarios = repository.findByApellido("Herrera");
//
//			System.out.println(misUsuarios);



		};
	}

}
