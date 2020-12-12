package br.com.products.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long productId;

    @NotNull
    private String name;

    @NotNull
    private int quantity;

    @NotNull
    private BigDecimal price;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "categoryId")
    private Category category;

}
