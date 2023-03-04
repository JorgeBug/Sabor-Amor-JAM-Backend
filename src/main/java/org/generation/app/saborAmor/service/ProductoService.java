package org.generation.app.saborAmor.service;


import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductService {

    @Autowired
    IProductoRepository productoRepository;



    @Override
    public List<Producto> findAllByCategoria(String categoria) {
        return productoRepository.findAllByCategoria(categoria);
    }

    @Override
    public List<Producto> getAllProductos() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto updateProducto(Producto producto) {
        return null;
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto deleteProducto(String productName) {
        return null;
    }
}
