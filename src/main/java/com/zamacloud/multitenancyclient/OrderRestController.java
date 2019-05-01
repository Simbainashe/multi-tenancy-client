package com.zamacloud.multitenancyclient;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 3:47 AM
 */
@RestController
@RequestMapping("v1/orders")
public class OrderRestController {
    private final OrderRepository orderRepository;

    public OrderRestController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public Order createOrder(@Valid  @RequestBody Order order){
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderRepository.findAll();
    }
}
