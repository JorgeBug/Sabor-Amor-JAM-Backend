package org.generation.app.saborAmor.service;
import org.generation.app.saborAmor.model.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Producto> findAllByCategoria(String categoria);

    List<Producto> getAllProductos();

    Producto updateProducto(Producto producto);

    Producto saveProducto(Producto producto);

    int deleteProductoById(int productId);

    Boolean productExistsById(int id);

    Producto getProductoById(int id);

}
