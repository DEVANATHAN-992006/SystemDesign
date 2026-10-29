package com.rest.repository;

import com.rest.models.table;
import java.util.ArrayList;
import java.util.List;

public class tablerepository {
    private final List<table> tables = new ArrayList<>();

    public tablerepository() {
        tables.add(new table(1, 2));
        tables.add(new table(2, 4));
    }

    public List<table> findAll() {
        return new ArrayList<>(tables);
    }
}
