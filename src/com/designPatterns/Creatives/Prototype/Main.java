package com.designPatterns.Creatives.Prototype;

public class Main {
    public static void main(String[] args) {

        Electrodomesticos elec = new Electrodomesticos();
        elec.nombre = "Heladera";
        elec.marca = "Dream";
        elec.cantidad = 1;
        System.out.println("Nombre: " + elec.nombre + "\nMarca: " + elec.marca + "\nCantidad: " + elec.cantidad);

        try {
            Electrodomesticos elec2 = elec.clonar();
            elec2.nombre = "Lavarropas";
            System.out.println("Nombre: " + elec2.nombre + "\nMarca: " + elec2.marca + "\nCantidad: " + elec2.cantidad);
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar: " + e.getMessage());
        }
    }
}
