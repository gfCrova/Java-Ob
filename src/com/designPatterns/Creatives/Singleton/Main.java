package com.designPatterns.Creatives.Singleton;

public class Main {
    public static void main(String[] args) {
        // Intentamos obtener la instancia de Singleton
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setContador(15);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(20);

        System.out.println("Valor del contador en singleton1: " + singleton1.getContador() + " en memoria: " + singleton1);
        System.out.println("Valor del contador en singleton2: " + singleton2.getContador() + " en memoria: " + singleton2);

        // Verificamos que ambas variables apuntan a la misma instancia
        if (singleton1 == singleton2) {
            System.out.println("Ambas variables apuntan a la misma instancia de Singleton.");
        } else {
            System.out.println("Las variables apuntan a diferentes instancias de Singleton.");
        }
    }
}
