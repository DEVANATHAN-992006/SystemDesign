package com.rest.services;

import com.rest.models.MenuItem;
import com.rest.repository.menurepository;
import java.util.List;

public class menuservice {

    private menurepository repository;

    public menuservice() {
        repository = new menurepository();
    }

    public List<MenuItem> getAllMenuItems() {
        return repository.findAll();
    }

    public void addMenuItem(MenuItem item) {
        repository.save(item);
    }
}