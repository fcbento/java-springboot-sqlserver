package br.com.produtos.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long usuarioId;

    @NotNull
    private String nome;

    @NotNull
    private String sobreNome;

    @NotNull
    private String email;
}
