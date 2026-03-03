package com.concepts.OOP.Dto;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
