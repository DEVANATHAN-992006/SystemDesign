
package com.rest.services;

import com.rest.models.Payment;
import com.rest.repository.paymentrepository;
import java.util.List;

public class paymentservice {

    private paymentrepository repository;

    public paymentservice() {
        repository = new paymentrepository();
    }

    public void createPayment(Payment payment) {
        repository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return repository.findAll();
    }
}