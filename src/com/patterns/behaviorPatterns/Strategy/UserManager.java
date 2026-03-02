package com.patterns.behaviorPatterns.Strategy;

import java.util.ArrayList;

// Encapsula la lógica de creación y gestión de usuarios.
public class UserManager {

    private IUsers strategy;

    // Permite decidir cómo se almacenarán los usuarios. Si en memoria o en archivo.
    public UserManager(IUsers strategy) {
        this.strategy = strategy;
    }

    // Permite cambiar la estrategia en runtime.
    public void setStrategy(IUsers strategy) {
        this.strategy = strategy;
    }

    // Delega la creación de usuario a la estrategia
    public void createUser(String name) {
        strategy.create(name);
    }

    // Delega la recuperación de usuarios a la estrategia
    public ArrayList<String> getUsers() {
        return strategy.getAll();
    }
}
