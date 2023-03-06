package org.generation.app.saborAmor.service;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;
import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.repository.IDatosEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosEnvioService implements IDatosEnvioService{

	@Autowired
	IDatosEnvioRepository datosEnvioRepository;
	
	@Override
	public List<DatosEnvio> getAllDatosEnvioByFkIdUsuario(int idUsuario) {
		return datosEnvioRepository.findAllDatosEnvioByFkIdUsuarioIdUsuario(idUsuario);
	}

	@Override
	public List<DatosEnvio> getAllDatosEnvioByEmail(String email) {
		
		return datosEnvioRepository.findAllDatosEnvioByFkIdUsuarioEmail(email);
	}

	@Override
	public List<DatosEnvio> getAllDatosEnvio() {
		return (List<DatosEnvio>) datosEnvioRepository.findAll();
	}

	@Override
	public int deleteDatosEnvioByIdEnvio(int idEnvio) {
		DatosEnvio datosEnvio = getDatosEnvioByIdEnvio(idEnvio);
		
		datosEnvioRepository.deleteById(idEnvio);
		return idEnvio;
	}

	@Override
	public DatosEnvio getDatosEnvioByIdEnvio(int idEnvio) {
		
		return datosEnvioRepository.findById(idEnvio)
				.orElseThrow( ()-> 
				new IllegalStateException("No existe los datos de envio: " + idEnvio));
	}

	@Override
	public DatosEnvio saveDatosEnvio(DatosEnvio datosEnvio) {
		
		return datosEnvioRepository.save(datosEnvio);
	}

	@Override
	public DatosEnvio updateDatosEnvio(DatosEnvio newDatosEnvio) {
		
		if(!datoEnvioExiteById(newDatosEnvio.getIdEnvio())) {
			throw new IllegalStateException("Los datos de envio Id: " + newDatosEnvio.getIdEnvio() +  " no existe");
		}
		else {
			DatosEnvio datosEnvio = getDatosEnvioByIdEnvio(newDatosEnvio.getIdEnvio());
	        updateDatosEnvio(newDatosEnvio,datosEnvio);

			datosEnvioRepository.save(datosEnvio);
			
			return datosEnvio;
			
		}
		
		
	}

	@Override
	public boolean datoEnvioExiteById(int idEnvio) {
		
		return datosEnvioRepository.existsById(idEnvio);
	}
	
	private void updateDatosEnvio (DatosEnvio newDatosEnvio, DatosEnvio datosEnvio) {
		datosEnvio.setNombre(newDatosEnvio.getNombre());
		datosEnvio.setApellido(newDatosEnvio.getApellido());
		datosEnvio.setCalle(newDatosEnvio.getCalle());
		datosEnvio.setNumExterior(newDatosEnvio.getNumExterior());
		datosEnvio.setInterior(newDatosEnvio.getInterior());
		datosEnvio.setCp(newDatosEnvio.getCp());
		datosEnvio.setColonia(newDatosEnvio.getColonia());
		datosEnvio.setEstado(newDatosEnvio.getEstado());
		datosEnvio.setMunicipio(newDatosEnvio.getMunicipio());
		datosEnvio.setFkIdUsuario(datosEnvio.getFkIdUsuario());
		
	}

}