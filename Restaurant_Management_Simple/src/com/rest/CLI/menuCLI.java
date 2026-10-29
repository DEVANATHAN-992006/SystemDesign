package com.rest.CLI;

import com.rest.models.MenuItem;
import com.rest.services.menuservice;
import java.util.List;
import java.util.Scanner;

public class menuCLI {

    private menuservice service;
    private Scanner sc = new Scanner(System.in);

    public menuCLI(menuservice service) {
        this.service = service;
    }

    public void displayMenu() {
        List<MenuItem> items = service.getAllMenuItems();

        System.out.println("\n----- RESTAURANT MENU -----");

        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void start() {
        displayMenu();
    }
}