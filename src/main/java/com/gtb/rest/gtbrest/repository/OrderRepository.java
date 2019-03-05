package com.gtb.rest.gtbrest.repository;

import com.gtb.rest.gtbrest.document.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderRepository extends ReactiveMongoRepository<Order, String> {
}
