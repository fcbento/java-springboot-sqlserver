package br.com.products.services;

import br.com.products.domain.Product;
import br.com.products.domain.User;
import br.com.products.repository.UserRepository;
import br.com.products.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User find(Integer id) {

        Optional<User> obj = Optional.ofNullable(repository.findById(id));

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Not found! Id: " + id + ", Type: " + Product.class.getName()));
    }

    public User save(User user){
        return repository.save(user);
    }

    public Page<User> list(Pageable page){
        return repository.findAll(page);
    }

    public void delete(User user){
        repository.delete(user);
    }

    public User update(User usuario){
        return repository.save(usuario);
    }

}
