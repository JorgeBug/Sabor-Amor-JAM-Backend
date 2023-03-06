package org.generation.app.saborAmor.service;


import org.generation.app.saborAmor.model.DatosEnvio;

import java.util.List;

public interface IDatosEnvioService {

    public List<DatosEnvio> getAllMetodosPagoByFkIdUsuario(int idUsuario);

}