
package com.rest.repository;

import com.rest.models.Payment;
import java.util.ArrayList;
import java.util.List;

public class paymentrepository {

    private List<Payment> payments = new ArrayList<>();

    public void save(Payment payment) {
        payments.add(payment);
    }

    public List<Payment> findAll() {
        return payments;
    }
}
