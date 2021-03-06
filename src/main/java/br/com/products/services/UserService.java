package br.com.products.services;

import br.com.products.domain.User;
import br.com.products.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public void save(User user){
        repository.save(user);
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
