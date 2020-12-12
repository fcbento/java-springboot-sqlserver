package br.com.products.services;

import br.com.products.models.Order;
import br.com.products.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public void save(Order order){
        order.setOrderStatus(1);
        repository.save(order);
    }

    public List<Order> list(){
        return repository.findAll();
    }

    public void delete(Order order){
        repository.delete(order);
    }

    public Order update(Order order){
        return repository.save(order);
    }
}
