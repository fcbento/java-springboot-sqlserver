package br.com.products.resources;

import br.com.products.domain.User;
import br.com.products.services.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Users")
public class UserResource {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public List<User> getAll(){
        return service.list();
    }

    @PostMapping("/user")
    public void save(@RequestBody User user){
        service.save(user);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user){
        return service.update(user);
    }

    @DeleteMapping("/user")
    public void delete(@RequestBody User user){
        service.delete(user);
    }

}
