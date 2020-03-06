package com.example.demo.service;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findByName(String productName) {
        return productRepository.findByName(productName);
    }

    public Product findById(String id) {
        return productRepository.findById(id).get();
    }

    public void addProduct(Product product) {
        product.setId(UUID.randomUUID().toString());
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(List<Product> product) {
        productRepository.deleteAll(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
