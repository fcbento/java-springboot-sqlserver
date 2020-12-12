package br.com.products.controllers;

import br.com.products.models.Product;
import br.com.products.services.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAll(){
        return service.list();
    }

    @PostMapping("/product")
    public void save(@RequestBody Product product){
        service.save(product);
    }

    @PutMapping("/product")
    public Product update(@RequestBody Product product){
        return service.update(product);
    }

    @DeleteMapping("/product")
    public void delete(@RequestBody Product product){
        service.delete(product);
    }
}
