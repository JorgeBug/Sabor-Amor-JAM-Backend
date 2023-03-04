package org.generation.app.saborAmor.service;
import org.generation.app.saborAmor.model.Producto;

import java.util.List;

public interface IProductService {

    List<Producto> findAllByCategoria(String categoria);

    List<Producto> getAllProductos();

    Producto updateProducto(Producto producto);

    Producto saveProducto(Producto producto);

    Producto deleteProducto(String productName);

}
