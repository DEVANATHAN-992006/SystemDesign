package com.rest.CLI;

import com.rest.models.table;
import com.rest.services.tableservice;
import java.util.List;
import java.util.Scanner;

public class tableCLI {
    private final tableservice service;
    private final Scanner scanner = new Scanner(System.in);

    public tableCLI(tableservice service) {
        this.service = service;
    }

    public void start() {
        System.out.println("---- Restaurant Management ----");
        System.out.println("1. View All Tables");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        String input = scanner.nextLine();

        if (input.equals("1")) {
            List<table> tables = service.getAllTables();
            System.out.println("\nAll Tables:");
            for (table tab : tables) {
                System.out.println(tab);
            }
        } else if (input.equals("0")) {
            System.out.println("Thank you!");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
