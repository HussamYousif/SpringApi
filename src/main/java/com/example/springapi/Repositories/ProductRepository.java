package com.example.springapi.Repositories;

import com.example.springapi.Models.Product;

import java.util.List;

public class ProductRepository {
    public List<Product> GetProducts() {
        return TestData.GetProducts();
    }
}
