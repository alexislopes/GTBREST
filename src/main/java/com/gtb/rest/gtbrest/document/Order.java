package com.gtb.rest.gtbrest.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Order {

    @Id
    private String id;
    private String costumer;
    private List<Burger> burgers;

    public Order() {
    }

    public Order(String id, String costumer, List<Burger> burgers) {
        this.id = id;
        this.costumer = costumer;
        this.burgers = burgers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public List<Burger> getBurgers() {
        return burgers;
    }

    public void setBurgers(List<Burger> burgers) {
        this.burgers = burgers;
    }

    public Double total(){
        Double total = 0.0;
        for(Burger burger : burgers){
            total = total + burger.getPreco();
        }
        return total;
    }
}
