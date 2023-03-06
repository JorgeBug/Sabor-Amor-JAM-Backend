package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;
import org.generation.app.saborAmor.repository.IDatosEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosEnvioService implements IDatosEnvioService{

    @Autowired
    IDatosEnvioRepository datosEnvioRepository;

    @Override
    public List<DatosEnvio> getAllMetodosPagoByFkIdUsuario(int idUsuario) {
        return datosEnvioRepository.findAllDatosEnvioByFkIdUsuarioIdUsuario(idUsuario);
    }

}