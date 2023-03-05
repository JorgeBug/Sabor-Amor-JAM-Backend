package org.generation.app.saborAmor.service;


import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Producto updateProducto(Producto newpDataProducto) {
        if (!productExistsById(newpDataProducto.getIdProducto()))
            throw new IllegalStateException("The product with id: " + newpDataProducto.getIdProducto() +  " doesn't exist");

        Producto producto = getProductoById(newpDataProducto.getIdProducto());
        updateProduct(newpDataProducto,producto);

        productoRepository.save(producto);
        return producto;
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public int deleteProductoById(int productId) {
        Producto producto = getProductoById(productId);
        productoRepository.deleteById(productId);
        return productId;
    }

    @Override
    public Boolean productExistsById(int id) {
        return productoRepository.existsById(id);
    }

    @Override
    public Producto getProductoById(int id) {
        return productoRepository.findById(id)
                .orElseThrow( ()->
                        new IllegalStateException("Product does not exist with id: " + id));
    }

    //Grabs all the attributes of the first product and uses them
    //to update the second one.
    private void updateProduct(Producto newDataProduct, Producto producto){
        producto.setNombre(newDataProduct.getNombre());
        producto.setPrecio(newDataProduct.getPrecio());
        producto.setContenido(newDataProduct.getContenido());
        producto.setDescripcion(newDataProduct.getDescripcion());
        producto.setImgLink(newDataProduct.getImgLink());
        producto.setSpicy(newDataProduct.getSpicy());
        producto.setCategoria(newDataProduct.getCategoria());
    }
}
