package com.ejercicioTEMA6;

public class manipularArrays {

    public static void main(String[] args) {

        // Recorrer un Array Unidimensional

        String[] coches = {"Toyota", "Chevrolet", "Honda", "Ford", "Mustang", "Ferrari"};

        for (String  coche:coches) {
            System.out.println(coche);
        }
        System.out.println("\n");

        // Recorrer un Array Bi-dimensional de enteros

        int[][] arrayBiEnteros = {
                {1, 2, 3, 4, 5, 6}, {10, 20, 30, 40, 50 , 60}
        };

        for (int i = 0; i < arrayBiEnteros.length; i++) {
            for (int j = 0; j < arrayBiEnteros[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBiEnteros[i][j]);
            }
            System.out.println("\n");
        }
    }

}
