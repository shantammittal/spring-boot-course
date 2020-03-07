package com.example.demo.service;

import com.example.demo.model.Orders;

import java.util.List;

public interface OrderService {

    List<Orders> getOrderById(String id);

    void addOrder(Orders orders);
}
