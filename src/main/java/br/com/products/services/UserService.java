package br.com.products.services;

import br.com.products.models.User;
import br.com.products.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public void save(User user){
        repository.save(user);
    }

    public List<User> list(){
        return repository.findAll();
    }

    public void delete(User user){
        repository.delete(user);
    }

    public User update(User usuario){
        return repository.save(usuario);
    }

}
