package com.example.demo.controller;

import com.example.demo.model.Orders;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/userId/{id}")
    private List<Orders> getOrderById(@PathVariable String id) {
        return orderService.getOrderById(id);
    }

    @PostMapping(value = "/add")
    private void addOrder(@RequestBody Orders orders) {
        orderService.addOrder(orders);
    }

}
