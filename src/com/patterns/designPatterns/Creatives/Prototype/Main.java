package com.patterns.designPatterns.Creatives.Prototype;

public class Main {
    public static void main(String[] args) {

        Electrodomesticos elec = new Electrodomesticos("Heladera", "Dream", 1);
        System.out.println("Nombre: " + elec.nombre + "\nMarca: " + elec.marca + "\nCantidad: " + elec.cantidad);

        Electrodomesticos elec2 = elec.clonar();
        elec2.nombre = "Lavarropas";
        System.out.println("Nombre: " + elec2.nombre + "\nMarca: " + elec2.marca + "\nCantidad: " + elec2.cantidad);
    }
}
