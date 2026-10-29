package com.rest.CLI;

import com.rest.models.Order;
import com.rest.models.OrderItem;
import com.rest.services.orderservice;
import java.util.List;
import java.util.Scanner;

public class orderCLI {

    private orderservice service;
    private Scanner sc = new Scanner(System.in);

    public orderCLI(orderservice service) {
        this.service = service;
    }

    public void start() {
        Order order = new Order(101, 1);

        order.addItem(new OrderItem(1, "Pizza", 2, 150));
        order.addItem(new OrderItem(2, "Juice", 1, 50));

        service.createOrder(order);

        System.out.println("Order Created Successfully!");

        List<Order> orders = service.getAllOrders();

        for (Order o : orders) {
            System.out.println(o);
        }
    }
}