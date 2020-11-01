package br.com.produtos.controllers;

import br.com.produtos.models.Produto;
import br.com.produtos.services.ProdutoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Produtos")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping("/produtos")
    public List<Produto> obter(){
        return service.listar();
    }

    @PostMapping("/produto")
    public void salvar(@RequestBody Produto produto){
        service.salvar(produto);
    }

    @PutMapping("/produto")
    public Produto atualizar(@RequestBody Produto produto){
        return service.atualizar(produto);
    }

    @DeleteMapping("/produto")
    public void deletar(@RequestBody Produto produto){
        service.deletar(produto);
    }
}
