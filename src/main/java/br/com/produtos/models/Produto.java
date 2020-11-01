package br.com.produtos.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long produtoId;

    @NotNull
    private String nome;

    @NotNull
    private int quantidade;

    @NotNull
    private BigDecimal valor;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "categoriaId")
    private Categoria categoria;

}
