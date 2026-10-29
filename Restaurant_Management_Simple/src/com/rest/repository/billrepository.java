package com.rest.repository;

import com.rest.models.Bill;
import java.util.ArrayList;
import java.util.List;

public class billrepository {

    private List<Bill> bills = new ArrayList<>();

    public void save(Bill bill) {
        bills.add(bill);
    }

    public List<Bill> findAll() {
        return bills;
    }
}