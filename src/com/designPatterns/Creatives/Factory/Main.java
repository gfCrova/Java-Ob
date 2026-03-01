package com.designPatterns.Creatives.Factory;

public class Main {
    public static void main(String[] args) {

        PrecioFactory precio = new PrecioFactory("USD");
        System.out.println("Precio en USD: " + precio.getPrecio());

        PrecioFactory precio2 = new PrecioFactory("EUR");
        System.out.println("Precio en EUR: " + precio2.getPrecio());
    }
}
