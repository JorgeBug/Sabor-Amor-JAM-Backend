package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Producto;
import org.generation.app.saborAmor.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductoController {

    @Autowired
    IProductService productService;


    @GetMapping("/catalogo") //localhost:8080/catalogo
    public List<Producto> getAllProductos(){
        return productService.getAllProductos();
    }

    @GetMapping("/catalogo/{categoria}") //localhost:8080/catalogo/salsa
    public List<Producto> getProductByCategory(@PathVariable("categoria") String categoria){
        return productService.findAllByCategoria(categoria);
    }

    @PostMapping("/catalogo")
    public Producto saveProduct(@RequestBody Producto producto){
        return productService.saveProducto(producto);

    }

    @PutMapping("/catalogo")
    public Producto updateProduct(@RequestBody Producto newDataProducto){
        return productService.updateProducto(newDataProducto);
    }

    //Delete mapping
    @DeleteMapping("/catalogo/{productId}")
    public ResponseEntity<?> deleteProductoById(@PathVariable("productId") int productId){
        try {
            return new ResponseEntity<Integer>(
                    productService.deleteProductoById(productId),
                    HttpStatus.OK);
        } catch (IllegalStateException e) {
            return new ResponseEntity<String>(e.getMessage() , HttpStatus.NOT_FOUND );
        }
    }

}
