package com.example.TestShop2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String characteristic;
    private String price;
    private int stock;

    public Product() {
    }

    public Product(String name, String characteristic, String price, int stock) {
        this.name = name;
        this.characteristic = characteristic;
        this.price = price;
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setCharacteristic(String setCharacteristic) {
        this.characteristic = setCharacteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStock(int stock) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }
}
