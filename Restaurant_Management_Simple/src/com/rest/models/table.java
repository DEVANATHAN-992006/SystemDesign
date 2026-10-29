package com.rest.models;

public class table {
    public enum Availability {
        FREE, OCCUPIED
    }

    private int id;
    private int capacity;
    private Availability status;

    public table(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.status = Availability.FREE;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public Availability getStatus() {
        return status;
    }

    public void freeTable() {
        status = Availability.FREE;
    }

    public void occupyTable() {
        status = Availability.OCCUPIED;
    }

    @Override
    public String toString() {
        return "Table ID: " + id
                + " | Capacity: " + capacity
                + " | Status: " + status;
    }
}
