package com.rest.models;

public class Bill {

    private int billId;
    private Order order;
    private double tax;

    public Bill(int billId, Order order) {
        this.billId = billId;
        this.order = order;
        this.tax = order.getTotalAmount() * 0.05;
    }

    public double getTotalAmount() {
        return order.getTotalAmount() + tax;
    }

    @Override
    public String toString() {
        return "Bill ID: " + billId
                + "\nOrder ID: " + order.getOrderId()
                + "\nSubtotal: " + order.getTotalAmount()
                + "\nTax (5%): " + tax
                + "\nGrand Total: " + getTotalAmount();
    }
}