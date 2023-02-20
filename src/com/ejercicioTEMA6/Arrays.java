package com.ejercicioTEMA6;

public class Arrays {

    public static void main(String[] args) {

        // Recorrer un Array Unidimensional

        String[] coches = {"Toyota", "Chevrolet", "Honda", "Ford", "Mustang", "Ferrari"};

        for (String  coche:coches) {
            System.out.println(coche);
        }

        // Recorrer un Array Bi-dimensional de enteros

        int[][] arrayBidiEnteros = {
                {1, 2, 3, 4, 5, 6}, {10, 20, 30, 40, 50 , 60}
        };

        for (int i = 0; i < arrayBidiEnteros.length; i++) {
            for (int j = 0; j < arrayBidiEnteros[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiEnteros[i][j]);
            }
        }
    }

}
