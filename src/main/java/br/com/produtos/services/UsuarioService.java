package br.com.produtos.services;

import br.com.produtos.models.Produto;
import br.com.produtos.models.Usuario;
import br.com.produtos.repository.ProdutoRepository;
import br.com.produtos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public void salvar(Usuario usuario){
        repository.save(usuario);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }

    public void deletar(Usuario produto){
        repository.delete(produto);
    }

    public Usuario atualizar(Usuario usuario){
        return repository.save(usuario);
    }

}
