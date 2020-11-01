package br.com.produtos.services;

import br.com.produtos.models.Produto;
import br.com.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public void salvar(Produto produto){
        repository.save(produto);
    }

    public List<Produto> listar(){
        return repository.findAll();
    }

    public void deletar(Produto produto){
        repository.delete(produto);
    }

    public Produto atualizar(Produto produto){
        return repository.save(produto);
    }

}
