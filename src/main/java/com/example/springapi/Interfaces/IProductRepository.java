package com.example.springapi.Interfaces;

import com.example.springapi.Models.Product;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

public interface IProductRepository {
    public List<Product> GetProducts(List<String> productIds) throws HttpClientErrorException.NotFound;
}
