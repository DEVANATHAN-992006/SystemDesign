package com.rest.repository;

import com.rest.models.Order;
import java.util.ArrayList;
import java.util.List;

public class orderrepository {

    private List<Order> orders = new ArrayList<>();

    public void save(Order order) {
        orders.add(order);
    }

    public List<Order> findAll() {
        return orders;
    }
}