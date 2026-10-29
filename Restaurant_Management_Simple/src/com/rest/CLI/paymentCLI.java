
package com.rest.CLI;

import com.rest.models.Payment;
import com.rest.services.paymentservice;
import java.util.Scanner;

public class paymentCLI {

    private paymentservice service;
    private Scanner scanner = new Scanner(System.in);

    public paymentCLI(paymentservice service) {
        this.service = service;
    }

    public void displayPayment(Payment payment) {

        System.out.println("\n----- SELECT PAYMENT METHOD -----");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash");
        System.out.println("4. Net Banking");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        String method;

        switch (choice) {
            case 1:
                method = "UPI";
                break;

            case 2:
                method = "CARD";
                break;

            case 3:
                method = "CASH";
                break;

            case 4:
                method = "NET BANKING";
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        Payment selectedPayment = new Payment(
                payment.getPaymentId(),
                payment.getAmount(),
                "SUCCESS",
                method
        );

        service.createPayment(selectedPayment);

        System.out.println("\n----- PAYMENT DETAILS -----");
        System.out.println("Payment ID: " + selectedPayment.getPaymentId());
        System.out.println("Amount: Rs. " + selectedPayment.getAmount());
        System.out.println("Status: " + selectedPayment.getStatus());
        System.out.println("Method: " + selectedPayment.getMethod());
    }
}
