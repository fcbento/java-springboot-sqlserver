package br.com.products.services;

import br.com.products.domain.Category;
import br.com.products.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public void save(Category categoria){
        repository.save(categoria);
    }

    public Page<Category> list(Pageable page){
        return repository.findAll(page);
    }

    public void delete(Category categoria){
        repository.delete(categoria);
    }

    public Category update(Category categoria){
        return repository.save(categoria);
    }
}
