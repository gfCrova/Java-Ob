package com.ejercicioTEMA3;

public class Main {
    public static void main(String[] args) {

        String[] marcasDeCoches = {"Ferrari", "Chevrolet", "Ford", "Honda", "Toyota", "Tesla"};

        int count = 1;
        for (String marca : marcasDeCoches) {
            String nuevaLista = count++ + " - " + marca;
            System.out.println(nuevaLista);
        }
    }
}
