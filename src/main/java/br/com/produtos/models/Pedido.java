package br.com.produtos.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long pedidoId;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "usuarioId")
    private Usuario usuario;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "produtoId")
    private Produto produto;

    @NotNull
    private String dataPedido;

    @NotNull
    private int statusPedido;
}
