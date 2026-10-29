package com.rest.models;

public class OrderItem {

    private int itemId;
    private String itemName;
    private int quantity;
    private double price;

    public OrderItem(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId
                + " | Name: " + itemName
                + " | Quantity: " + quantity
                + " | Price: " + price
                + " | Total: " + getTotalPrice();
    }
}