package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> getAllUsuarios();

    public Usuario setUsuario(Usuario usuario);

    public boolean existUsuarioByEmail(String email);

    public Usuario updateUsuario(Usuario customer);

    public Usuario getUsuarioById(int id);

    public List<Usuario> getUsuarioByEmail(String email);

    public String deleteUsuarioById(int idUsuario);

}
