package br.com.produtos.controllers;

import br.com.produtos.models.Usuario;
import br.com.produtos.services.UsuarioService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @GetMapping("/usuarios")
    public List<Usuario> obter(){
        return service.listar();
    }

    @PostMapping("/usuario")
    public void salvar(@RequestBody Usuario usuario){
        service.salvar(usuario);
    }

    @PutMapping("/usuario")
    public Usuario atualizar(@RequestBody Usuario usuario){
        return service.atualizar(usuario);
    }

    @DeleteMapping("/usuario")
    public void deletar(@RequestBody Usuario usuario){
        service.deletar(usuario);
    }

}
