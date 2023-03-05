//package org.generation.app.saborAmor.controller;
//
//import org.generation.app.saborAmor.model.Pedido;
//import org.generation.app.saborAmor.service.IPedidoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api")
//public class PedidoController {
//
//    @Autowired
//    IPedidoService pedidoService;
//
//
//    @GetMapping("/pedido/{id}")
//    public List<Pedido> getAllAddressesByFkIdCustomer(@PathVariable("id") int idUsuario){
//        return pedidoService.getAllPedidosByFkIdUsuario(idUsuario);
//    }
//
//
//
//}
