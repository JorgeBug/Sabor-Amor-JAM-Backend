package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.dto.UsuarioDto;
import org.generation.app.saborAmor.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> getAllUsuarios();
    
    public Usuario getUsuarioByEmail(String email);

    public Usuario setUsuario(Usuario usuario);

    public boolean existUsuarioByEmail(String email);

    public Usuario updateUsuario(Usuario customer);

    public Usuario getUsuarioById(int id);
    public UsuarioDto getUsuarioDtoById(int id);

    public String deleteUsuarioById(int idUsuario);

}
