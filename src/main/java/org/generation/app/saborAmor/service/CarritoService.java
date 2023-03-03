package org.generation.app.saborAmor.service;


import org.generation.app.saborAmor.model.Carrito;
import org.generation.app.saborAmor.repository.ICarritoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoService implements ICarritoService {

    @Autowired
    ICarritoRepositorio carritoRepositorio;

    @Override
    public void guardarAlgoEnCarrito(Carrito carrito) {
         carritoRepositorio.save(carrito);
    }

    @Override
    public List<Carrito> getAllCarritos() {
        List<Carrito> listCarritos =  (List<Carrito>) carritoRepositorio.findAll();
        return listCarritos;
    }


}
