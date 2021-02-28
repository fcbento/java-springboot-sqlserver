package br.com.products.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "DATA_USER")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long userId;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private int userType;
}
