package com.gtb.rest.gtbrest.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Customer {

    @Id
    private String id;
    private String nome;
    private List<Order> orders;

    public Customer() {
    }

    public Customer(String nome) {
        this.nome = nome;
    }

    public Customer(String nome, List<Order> orders) {
        this.nome = nome;
        this.orders = orders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
