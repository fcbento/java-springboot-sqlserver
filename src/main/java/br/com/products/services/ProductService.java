package br.com.products.services;

import br.com.products.models.Product;
import br.com.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public void save(Product product){
        repository.save(product);
    }

    public List<Product> list(){
        return repository.findAll();
    }

    public void delete(Product product){
        repository.delete(product);
    }

    public Product update(Product product){
        return repository.save(product);
    }

}
