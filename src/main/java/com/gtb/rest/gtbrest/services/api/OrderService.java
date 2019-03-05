package com.gtb.rest.gtbrest.services.api;

import com.gtb.rest.gtbrest.document.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {
    Flux<Order> findAll();

    Mono<Order> findById(String id);

    Mono<Order> save(Order order);
}
