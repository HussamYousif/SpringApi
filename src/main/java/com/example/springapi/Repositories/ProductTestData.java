package com.example.springapi.Repositories;

import com.example.springapi.Models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductTestData {

    static List<Product> GetProducts() {
        var products = new ArrayList<Product>();

        /*
                productCatalog.put("0001", new Product("0001", "Rolex Watch", 1000, new Discount(3, 2000)));
        productCatalog.put("0002", new Product("0002", "Michael Kors Purse", 80, new Discount(2, 120)));
        productCatalog.put("0003", new Product("0003", "iPhone XS", 400, null));
        productCatalog.put("0004", new Product("0004", "Casio Watch", 30, null));

         */
        // This could be generated.
        products.add(new Product("001", "Jordan toothbrush", 26, "001"));
        products.add(new Product("002", "Norwegian potatoes", 5, "002"));
        products.add(new Product("003", "Scented soap", 10, "003"));
        products.add(new Product("004", "Organic shampoo", 15, "004"));
        products.add(new Product("005", "Cotton T-shirt", 20, null));
        products.add(new Product("006", "Premium coffee", 35, "005"));
        products.add(new Product("007", "High-end laptop", 1000, null));
        products.add(new Product("008", "Comfortable chair", 75, "006"));


        return products;
    }
}
