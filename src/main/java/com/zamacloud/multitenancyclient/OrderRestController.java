package com.zamacloud.multitenancyclient;

import com.zamacloud.commons.usercontext.UserContext;
import com.zamacloud.commons.usercontext.UserContextService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 3:47 AM
 */
@RestController
@RequestMapping("v1/orders")
public class OrderRestController {
    private final OrderRepository orderRepository;
    private final UserContextService userContextService;

    public OrderRestController(OrderRepository orderRepository, UserContextService userContextService) {
        this.orderRepository = orderRepository;
        this.userContextService = userContextService;
    }

    @PostMapping
    public Order createOrder(@Valid  @RequestBody Order order){
        Long tenantId= Optional.ofNullable(userContextService.getUserContext()).map(UserContext::getTenantId).orElse(null);
        order.setTenant(Tenant.of(tenantId));
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getOrders(){
        Long tenantId= Optional.ofNullable(userContextService.getUserContext()).map(UserContext::getTenantId).orElse(null);
        return orderRepository.findByTenant_Id(tenantId);
    }
}
