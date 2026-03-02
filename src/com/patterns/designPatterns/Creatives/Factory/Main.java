package com.patterns.designPatterns.Creatives.Factory;

public class Main {
    public static void main(String[] args) {

        Precio precioUSD = PrecioFactory.create("USD");
        System.out.println("Precio en USD: " + precioUSD.getPrecio());

        Precio precioEUR = PrecioFactory.create("EUR");
        System.out.println("Precio en EUR: " + precioEUR.getPrecio());
    }
}
