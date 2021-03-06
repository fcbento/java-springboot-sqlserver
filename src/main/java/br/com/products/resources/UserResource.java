package br.com.products.resources;

import br.com.products.domain.User;
import br.com.products.services.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/users")
@Api(value="API REST - Users")
public class UserResource {

    @Autowired
    UserService service;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<User> find(@PathVariable Integer id){
        User obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<Page<User>> getAll(Pageable page){
        Page<User> users = service.list(page);
        return ResponseEntity.ok().body(users);
    }

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Void> save(@RequestBody User user){
        User obj = service.save(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getUserId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(method=RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody User user){
        User obj = service.update(user);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@RequestBody User user){
        service.delete(user);
        return ResponseEntity.noContent().build();
    }

}
