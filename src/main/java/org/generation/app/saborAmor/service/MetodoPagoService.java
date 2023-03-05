package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.generation.app.saborAmor.repository.IMetodoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetodoPagoService implements IMetodoPagoService{
	
	@Autowired
	IMetodoPagoRepository metodoRepository;
	

	@Override
	public List<MetodoPago> getAllMetodosPagoByFkIdUsuario(int idUsuario) {
		return metodoRepository.findAllMetodoPagoByFkIdUsuarioIdUsuario(idUsuario);
	}

}
