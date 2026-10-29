
package com.rest.models;

public class Payment {

    private int paymentId;
    private double amount;
    private String status;
    private String method;

    public Payment(int paymentId, double amount, String status, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = status;
        this.method = method;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getMethod() {
        return method;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentId
                + "\nAmount: Rs. " + amount
                + "\nStatus: " + status
                + "\nMethod: " + method;
    }
}
