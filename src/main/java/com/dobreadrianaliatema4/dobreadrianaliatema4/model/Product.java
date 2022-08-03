package com.dobreadrianaliatema4.dobreadrianaliatema4.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
