package com.example.springapi.Repositories;

import com.example.springapi.Interfaces.IProductRepository;
import com.example.springapi.Models.Product;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public List<Product> GetProducts(List<String> productIds) throws HttpClientErrorException.NotFound {
        List<Product> results = new ArrayList<>();

        for (String id : productIds) {
            var current = ProductTestData.GetProducts().stream().filter(p -> p.productId() == id).toList();
            if (current.isEmpty()) {
                throw new RuntimeException("ProductId not found: " + productIds + "!");
            }

            results.add(current.get(0));
        }
        return results;
    }
}
