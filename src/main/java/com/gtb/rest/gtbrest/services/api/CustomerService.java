package com.gtb.rest.gtbrest.services.api;

import com.gtb.rest.gtbrest.document.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Flux<Customer> findAll();

    Mono<Customer> findById(String id);

    Mono<Customer> save(Customer customer);
}
