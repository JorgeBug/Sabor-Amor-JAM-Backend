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

    @Override
    public Usuario updateUsuario(Usuario newDataCustomer) {
        if ( !existUsuarioByEmail(newDataCustomer.getEmail() ) )
            throw new IllegalStateException("The user does not exist with email: " + newDataCustomer.getEmail());
        else if ( newDataCustomer.getEmail().length() > 150 )
            throw new IllegalStateException("Email length is greater than: " + 150);

        // Obtener los datos actuales del cliente
        Usuario customer = getUsuarioById(newDataCustomer.getIdUsuario());
        //Actualizar los datos permitidos
      //  customer.setIdUsuario(newDataCustomer.getIdUsuario());
        customer.setNombre( newDataCustomer.getNombre() );
        customer.setApellido( newDataCustomer.getApellido() );
        customer.setContrasenia( newDataCustomer.getContrasenia() );

        return usuarioRepository.save(customer);
    }

    @Override
    public Usuario getUsuarioById(int id) {
        return usuarioRepository.findById(id)
                .orElseThrow( ()->
                        new IllegalStateException("User does not exist with id: " + id));
    }
}
