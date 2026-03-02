package com.patterns.behaviorPatterns.Strategy;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Estrategia en memoria
        UserManager manager = new UserManager(new MemoryUsers());

        manager.createUser("Juan");
        manager.createUser("Ana");

        System.out.println("Usuarios en memoria:");
        System.out.println(manager.getUsers());

        // 2️⃣ Cambiamos estrategia en runtime
        manager.setStrategy(new FileUsers());

        manager.createUser("Carlos");

        System.out.println("Usuarios en archivo:");
        System.out.println(manager.getUsers());
    }
}
