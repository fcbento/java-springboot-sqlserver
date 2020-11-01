package br.com.produtos.services;

import br.com.produtos.models.Categoria;
import br.com.produtos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repository;

    public void salvar(Categoria categoria){
        repository.save(categoria);
    }

    public List<Categoria> listar(){
        return repository.findAll();
    }

    public void deletar(Categoria categoria){
        repository.delete(categoria);
    }

    public Categoria atualizar(Categoria categoria){
        return repository.save(categoria);
    }
}
