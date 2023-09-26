package com.example.springapi.Repositories;

import com.example.springapi.Models.Product;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    static List<Product> GetProducts() {
        var products = new ArrayList<Product>();

        // This could be generated.
        products.add(new Product("001", "Jordan toothbrush", 26));
        products.add(new Product("002", "Norwegian potatoes", 5));
        products.add(new Product("003", "Scented soap", 10));
        products.add(new Product("004", "Organic shampoo", 15));
        products.add(new Product("005", "Cotton T-shirt", 20));
        products.add(new Product("006", "Premium coffee", 35));
        products.add(new Product("007", "High-end laptop", 1000));
        products.add(new Product("008", "Comfortable chair", 75));
        products.add(new Product("009", "Bestseller book", 12));
        products.add(new Product("010", "Warm socks", 8));
        products.add(new Product("011", "Cool Axe", 8));
        products.add(new Product("012", "Spanish Tomatoes", 200));

        return products;
    }
}