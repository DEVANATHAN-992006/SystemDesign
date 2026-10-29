package com.rest;
import com.rest.CLI.paymentCLI;
import com.rest.models.Payment;
import com.rest.services.paymentservice;
import com.rest.CLI.menuCLI;
import com.rest.CLI.billCLI;
import com.rest.models.Order;
import com.rest.models.OrderItem;
import com.rest.models.Payment;
import com.rest.services.menuservice;
import com.rest.services.orderservice;
import com.rest.services.billservice;

public class Main {

    public static void main(String[] args) {

        // 1. Display Menu
        menuservice menuService = new menuservice();
        menuCLI menu = new menuCLI(menuService);

        menu.start();

        // 2. Create Order
        System.out.println("\n----- ORDER DETAILS -----");

        orderservice orderService = new orderservice();

        Order order = new Order(101, 1);

        order.addItem(new OrderItem(1, "Pizza", 2, 150.0));
        order.addItem(new OrderItem(3, "Juice", 1, 50.0));

        orderService.createOrder(order);

        System.out.println(order);

        // 3. Generate Bill
        System.out.println("\n----- BILL DETAILS -----");

        billservice billService = new billservice();
        billCLI bill = new billCLI(billService);

        bill.generateBill(order);

        // 4. Payment Details
        System.out.println("\n----- PAYMENT DETAILS -----");

        double paymentAmount = order.getTotalAmount() * 1.05;

        Payment payment = new Payment(
                1,
                paymentAmount,
                "SUCCESS",
                "UPI"
        );

        //  System.out.println(payment);
paymentservice paymentService = new paymentservice();
paymentCLI paymentCli = new paymentCLI(paymentService);

Payment paymentDetails = new Payment(
        1,
        367.50,
        "SUCCESS",
        "UPI"
);

paymentCli.displayPayment(paymentDetails);

        // 5. End
        System.out.println("\n----- THANK YOU -----");
    }
}
