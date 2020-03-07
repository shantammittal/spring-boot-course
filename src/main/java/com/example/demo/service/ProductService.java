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
    private ProductRepository productRepository;

    public List<Product> findByType(String productType) {
        return productRepository.findByType(productType);
    }

    public List<String> findDistinctType() {
        return productRepository.findDistinctType();
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

    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
