package com.rest.CLI;

import com.rest.models.Bill;
import com.rest.models.Order;
import com.rest.services.billservice;
import java.util.List;

public class billCLI {

    private billservice service;

    public billCLI(billservice service) {
        this.service = service;
    }

    public void generateBill(Order order) {

        Bill bill = new Bill(1, order);

        service.createBill(bill);

        System.out.println("\n----- BILL -----");
        System.out.println(bill);
    }

    public void displayBills() {
        List<Bill> bills = service.getAllBills();

        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }
}