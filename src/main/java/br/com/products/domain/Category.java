package br.com.products.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long categoryId;

    @NotNull
    private String name;

}
