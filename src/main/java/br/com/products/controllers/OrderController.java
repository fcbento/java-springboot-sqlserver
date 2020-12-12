package br.com.products.controllers;

import br.com.products.models.Order;
import br.com.products.services.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Orders")
public class OrderController {

    @Autowired
    OrderService service;

    @GetMapping("/orders")
    public List<Order> getAll(){
        return service.list();
    }

    @PostMapping("/order")
    public void save(@RequestBody Order order){
        service.save(order);
    }

    @PutMapping("/order")
    public Order update(@RequestBody Order order){
        return service.update(order);
    }

    @DeleteMapping("/order")
    public void delete(@RequestBody Order order){
        service.delete(order);
    }
}
