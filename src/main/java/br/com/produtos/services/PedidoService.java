package br.com.produtos.services;

import br.com.produtos.models.Pedido;
import br.com.produtos.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repository;

    public void salvar(Pedido pedido){
        pedido.setStatusPedido(1);
        repository.save(pedido);
    }

    public List<Pedido> listar(){
        return repository.findAll();
    }

    public void deletar(Pedido pedido){
        repository.delete(pedido);
    }

    public Pedido atualizar(Pedido pedido){
        return repository.save(pedido);
    }
}
