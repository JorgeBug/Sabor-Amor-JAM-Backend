package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.Usuario;
import org.generation.app.saborAmor.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    IUsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }
}
