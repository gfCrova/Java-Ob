package com.conceptos.Funciones;

public class Sobrecarga {
    public static void main(String[] args) {

        // Llamada a las funciones sobrecargadas
        functionOverload();
        functionOverload("Gustavo");
        functionOverload("Edad:", 42);

    }

    // Sobrecarga de funciones: Mismo nombre, diferente número/tipo de parámetros

    static void functionOverload() {
        System.out.println("Función sin parámetros.");
    }

    static void functionOverload(String param) {
        System.out.println("Función con un parámetro: " + param);
    }

    static void functionOverload(String param1, int param2) {
        System.out.println("Función con dos parámetros: " + param1 + " " + param2);
    }

}
