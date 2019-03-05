package com.gtb.rest.gtbrest.handlers;

import com.gtb.rest.gtbrest.document.Customer;
import com.gtb.rest.gtbrest.services.api.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class CustomerHandler {

    @Autowired
    CustomerService service;

    public Mono<ServerResponse> findAll(ServerRequest request){
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.findAll(), Customer.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request){
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.findById(id), Customer.class);
    }

    public Mono<ServerResponse> save(ServerRequest request){
        final Mono<Customer> costumer = request.bodyToMono(Customer.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(costumer.flatMap(service::save), Customer.class));
    }
}
