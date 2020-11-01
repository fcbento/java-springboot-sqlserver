package br.com.produtos.controllers;

import br.com.produtos.models.Pedido;
import br.com.produtos.models.Produto;
import br.com.produtos.services.PedidoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Pedidos")
public class PedidoController {

    @Autowired
    PedidoService service;

    @GetMapping("/pedidos")
    public List<Pedido> obter(){
        return service.listar();
    }

    @PostMapping("/pedido")
    public void salvar(@RequestBody Pedido pedido){
        service.salvar(pedido);
    }

    @PutMapping("/pedido")
    public Pedido atualizar(@RequestBody Pedido pedido){
        return service.atualizar(pedido);
    }

    @DeleteMapping("/pedido")
    public void deletar(@RequestBody Pedido pedido){
        service.deletar(pedido);
    }
}
