package com.rest.repository;

import com.rest.models.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class menurepository {

    private List<MenuItem> menuItems = new ArrayList<>();

    public menurepository() {
        menuItems.add(new MenuItem(1, "Pizza", 150));
        menuItems.add(new MenuItem(2, "Burger", 100));
        menuItems.add(new MenuItem(3, "Juice", 50));
    }

    public void save(MenuItem item) {
        menuItems.add(item);
    }

    public List<MenuItem> findAll() {
        return menuItems;
    }
}