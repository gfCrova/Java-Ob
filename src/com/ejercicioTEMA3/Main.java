package com.ejercicioTEMA3;

public class Main {
    public static void main(String[] args) {

        String[] marcasDeCoches = {"Ferrari", "Chevrolet", "Ford", "Honda", "Toyota", "Tesla"};

        int count = 1;
        for (String marcas:marcasDeCoches) {
            String nuevaLista = count++ + " - " + marcas;
            System.out.println(nuevaLista);
        }
    }
}
