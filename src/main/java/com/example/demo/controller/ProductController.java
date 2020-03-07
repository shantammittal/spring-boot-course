package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/type/{productType}")
    public List<Product> productByType(@PathVariable String productType) {
        return productService.findByType(productType);
    }
    @GetMapping(path = "/type")
    public List<String> productTypes() {
        return productService.findDistinctType();
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProduct();
    }

    @GetMapping(path = "/{id}")
    public Product productById(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PostMapping(path = "/update")
    public void update(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @PostMapping(path = "/delete")
    public void delete(@RequestBody String productId) {
        productService.deleteProduct(productId);
    }

}
