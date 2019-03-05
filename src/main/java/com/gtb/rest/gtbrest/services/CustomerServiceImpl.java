package com.gtb.rest.gtbrest.services;

import com.gtb.rest.gtbrest.document.Customer;
import com.gtb.rest.gtbrest.repository.CustomerRepository;
import com.gtb.rest.gtbrest.services.api.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Flux<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Mono<Customer> save(Customer customer) {
        return customerRepository.save(customer);
    }
}
