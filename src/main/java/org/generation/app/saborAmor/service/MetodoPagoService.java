package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.MetodoPago;
import org.generation.app.saborAmor.model.Producto;
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

	@Override
	public List<MetodoPago> getAllMetodosPagoByEmail(String email) {
		return metodoRepository.findAllMetodoPagoByFkIdUsuarioEmail(email);
	}

	@Override
	public MetodoPago setMetodoPago(MetodoPago metodoPago) {
		return metodoRepository.save(metodoPago);
	}

	@Override
	public MetodoPago updateMetodoPago(MetodoPago metodoPago) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProductoByNumTarjeta(String numTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetodoPago getMetodoPagoById(int idTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
