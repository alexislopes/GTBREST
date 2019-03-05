package com.gtb.rest.gtbrest.services;

import com.gtb.rest.gtbrest.document.Order;
import com.gtb.rest.gtbrest.repository.OrderRepository;
import com.gtb.rest.gtbrest.services.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PedidoServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Flux<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Mono<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    @Override
    public Mono<Order> save(Order order) {
        return orderRepository.save(order);
    }
}
