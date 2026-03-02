package com.patterns.behaviorPatterns.Strategy;

import java.util.ArrayList;

public class MemoryUsers implements IUsers {

    private final ArrayList<String> users = new ArrayList<>();

    @Override
    public void create(String name) {
        users.add(name);
    }

    @Override
    public ArrayList<String> getAll() {
        return users;
    }
}
