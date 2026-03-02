package com.patterns.designPatterns.Structural.Adapter;

public class Main {

    public static void main(String[] args) {

        Ventilador ventilador = new Ventilador();
        Lampara lampara = new Lampara();
        EstufaElectrica estufaElectrica = new EstufaElectrica();
        PowerAdapter ventilador2 = new PowerAdapter(ventilador);

        ventilador2.enciende();
        lampara.enciende();
        estufaElectrica.enciende();

        System.out.println("Ventilador prendido:" + ventilador2.estaEncendido() + "\n"
                        + "Lampara prendida:" + lampara.estaEncendido() + "\n"
                        + "Estufa prendida:" + estufaElectrica.estaEncendido() + "\n");

        ventilador2.apaga();
        //lampara.apaga();
        estufaElectrica.apaga();

        System.out.println("Ventilador prendido:" + ventilador2.estaEncendido() + "\n"
                        + "Lampara prendida:" + lampara.estaEncendido() + "\n"
                        + "Estufa prendida:" + estufaElectrica.estaEncendido() + "\n");
    }
}