package br.com.produtos.repository;

import br.com.produtos.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    Pedido findById(long id);
}