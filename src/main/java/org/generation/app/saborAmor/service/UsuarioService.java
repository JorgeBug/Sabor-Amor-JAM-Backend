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

    @Override
    public Usuario setUsuario(Usuario usuario) {
        if ( existUsuarioByEmail(usuario.getEmail() ) )
            throw new IllegalStateException("The user already exists with email: " + usuario.getEmail());
        else if ( usuario.getEmail().length() > 150 )
            throw new IllegalStateException("Email length is greater than: " + 150);

        return usuarioRepository.save(usuario);

    }

    @Override
    public boolean existUsuarioByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }
}
