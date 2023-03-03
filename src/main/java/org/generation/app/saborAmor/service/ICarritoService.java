package org.generation.app.saborAmor.service;

import org.generation.app.saborAmor.model.Carrito;

import java.util.List;

public interface ICarritoService {

    public void guardarAlgoEnCarrito(Carrito carrito);

    public List<Carrito> getAllCarritos();

}
