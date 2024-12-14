package com.example.online.store.model;

import java.util.UUID;

@Entity
public class Product {

    @Id
    private UUID id;
    private String name;
    private double price;

    // Геттеры и сеттеры
}
