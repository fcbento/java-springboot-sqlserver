package br.com.products.resources;

import br.com.products.domain.Category;
import br.com.products.services.CategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/categories")
@Api(value="API REST - Category")
public class CategoryResource {

    @Autowired
    CategoryService service;

    @GetMapping()
    public Page<Category> getAll(Pageable page){
        return service.list(page);
    }

    @PostMapping()
    public void save(@RequestBody Category category){
        service.save(category);
    }

    @PutMapping()
    public Category update(@RequestBody Category category){
        return service.update(category);
    }

    @DeleteMapping()
    public void delete(@RequestBody Category category){
        service.delete(category);
    }
}
