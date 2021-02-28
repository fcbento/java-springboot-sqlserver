package br.com.products.resources;

import br.com.products.domain.Category;
import br.com.products.services.CategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Category")
public class CategoryResource {

    @Autowired
    CategoryService service;

    @GetMapping("/categories")
    public List<Category> getAll(){
        return service.list();
    }

    @PostMapping("/category")
    public void save(@RequestBody Category category){
        service.save(category);
    }

    @PutMapping("/category")
    public Category update(@RequestBody Category category){
        return service.update(category);
    }

    @DeleteMapping("/category")
    public void delete(@RequestBody Category category){
        service.delete(category);
    }
}
