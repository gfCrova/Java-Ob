package com.concepts.OOP.ejercicioObjects.Dto;

import java.util.ArrayList;

public class Users {

    ArrayList<User> usersList = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return usersList;
    }

    public void addUser(User user) {
            usersList.add(user);
    }

    public User obtenerUser(String name){
        for (User user : usersList){
            if(user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }
}
