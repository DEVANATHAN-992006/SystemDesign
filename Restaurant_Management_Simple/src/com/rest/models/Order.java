package com.rest.models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private int tableId;
    private List<OrderItem> items;

    public Order(int orderId, int tableId) {
        this.orderId = orderId;
        this.tableId = tableId;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotalAmount() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }

        return total;
    }
    public int getOrderId() {
    return orderId;
}

    @Override
    public String toString() {
        return "Order ID: " + orderId
                + " | Table ID: " + tableId
                + " | Items: " + items
                + " | Total Amount: " + getTotalAmount();
    }
}