package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/getByProductName/{productName}")
    public List<Product> getAllProducts(@PathVariable String productName) {

        return productService.findByName(productName);
    }

    @GetMapping(value = "/allProduct")
    public List<Product> getAllProducts() {
        return productService.getAllProduct();
    }

    @GetMapping(path = "/ProductId/{id}")
    public Product getAllProductById(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping(path = "/addProduct")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PostMapping(path = "/updateProduct")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @PostMapping(path = "/deleteProduct")
    public void updateProduct(@RequestBody List<Product> product) {
        productService.deleteProduct(product);
    }

}
