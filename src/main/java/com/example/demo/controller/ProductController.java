package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/type/{productType}")
    public List<Product> productByType(@PathVariable String productType) {
        return productService.findByType(productType);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProduct();
    }

    @GetMapping(path = "/{id}")
    public Product getAllProductById(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping(path = "/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PostMapping(path = "/update")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @PostMapping(path = "/delete")
    public void updateProduct(@RequestBody String productId) {
        productService.deleteProduct(productId);
    }

}
