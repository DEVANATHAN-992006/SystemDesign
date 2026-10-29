package com.rest.services;

import com.rest.models.Order;
import com.rest.repository.orderrepository;
import java.util.List;

public class orderservice {

    private orderrepository repository;

    public orderservice() {
        repository = new orderrepository();
    }

    public void createOrder(Order order) {
        repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}