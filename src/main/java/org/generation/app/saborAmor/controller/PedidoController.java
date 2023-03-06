package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Pedido;
import org.generation.app.saborAmor.model.PedidoProducto;
import org.generation.app.saborAmor.service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PedidoController {

    @Autowired
    IPedidoService pedidoService;


    @GetMapping("/pedido/{id}")
    public List<Pedido> getAllPedidosByUsuarioId(@PathVariable("id") int idUsuario){
        return pedidoService.getAllPedidoProductoByPedidoId(idUsuario);
    }

    @PostMapping("/pedido/")
    public Pedido createPedido(@RequestBody Pedido newPedidoData){
        return pedidoService.savePedido(newPedidoData);
    }





}
