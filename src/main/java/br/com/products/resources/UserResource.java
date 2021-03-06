package br.com.products.resources;

import br.com.products.domain.User;
import br.com.products.services.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/users")
@Api(value="API REST - Users")
public class UserResource {

    @Autowired
    UserService service;

    @GetMapping()
    public Page<User> getAll(Pageable page){
        return service.list(page);
    }

    @PostMapping()
    public void save(@RequestBody User user){
        service.save(user);
    }

    @PutMapping()
    public User update(@RequestBody User user){
        return service.update(user);
    }

    @DeleteMapping()
    public void delete(@RequestBody User user){
        service.delete(user);
    }

}
