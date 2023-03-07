package org.generation.app.saborAmor.repository;

import org.generation.app.saborAmor.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUsuarioRepository extends CrudRepository<Usuario,Integer> {

    Usuario findUsuarioByEmail(String email);

    boolean existsByEmail(String email); 

}
