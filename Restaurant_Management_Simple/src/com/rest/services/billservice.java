package com.rest.services;

import com.rest.models.Bill;
import com.rest.repository.billrepository;
import java.util.List;

public class billservice {

    private billrepository repository;

    public billservice() {
        repository = new billrepository();
    }

    public void createBill(Bill bill) {
        repository.save(bill);
    }

    public List<Bill> getAllBills() {
        return repository.findAll();
    }
}