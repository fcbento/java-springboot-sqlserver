package br.com.produtos.controllers;

import br.com.produtos.models.Categoria;
import br.com.produtos.models.Produto;
import br.com.produtos.services.CategoriaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Categoria")
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @GetMapping("/categorias")
    public List<Categoria> obter(){
        return service.listar();
    }

    @PostMapping("/categoria")
    public void salvar(@RequestBody Categoria categoria){
        service.salvar(categoria);
    }

    @PutMapping("/categoria")
    public Categoria atualizar(@RequestBody Categoria categoria){
        return service.atualizar(categoria);
    }

    @DeleteMapping("/categoria")
    public void deletar(@RequestBody Categoria categoria){
        service.deletar(categoria);
    }
}
