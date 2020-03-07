package com.example.demo.service;

import com.example.demo.model.Orders;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Orders> getOrderById(String id) {
        return orderRepository.findByUserId(id);
    }

    @Override
    public void addOrder(Orders orders) {
        orders.setUserId(UUID.randomUUID().toString());
        orderRepository.save(orders);
    }
}
