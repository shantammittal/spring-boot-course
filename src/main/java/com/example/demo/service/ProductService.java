package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findByType(String productType);

    public Product findById(String id);

    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(String productId);

    public List<Product> getAllProduct();

    public List<String> findDistinctType();

}
