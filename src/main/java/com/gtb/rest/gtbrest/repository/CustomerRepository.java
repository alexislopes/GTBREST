package com.gtb.rest.gtbrest.repository;

import com.gtb.rest.gtbrest.document.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
