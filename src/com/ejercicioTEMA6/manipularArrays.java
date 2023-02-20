package com.ejercicioTEMA6;

import java.util.Vector;

public class Arrays {

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

        // Recorrer un Vertor

        Vector<Integer> mundialesSigloXXI = new Vector<>();

        mundialesSigloXXI.add(2002);
        mundialesSigloXXI.add(2006);
        mundialesSigloXXI.add(2010);
        mundialesSigloXXI.add(2014);
        mundialesSigloXXI.add(2018);
        mundialesSigloXXI.add(2022);

        System.out.println(mundialesSigloXXI.size() + ", " + mundialesSigloXXI.capacity());

        mundialesSigloXXI.remove(1);
        mundialesSigloXXI.remove(2);

        System.out.println(mundialesSigloXXI.size() + ", " + mundialesSigloXXI.capacity());

        for (int i = 0; i < mundialesSigloXXI.size(); i++) {
            System.out.println("Valor en la posición " + i + " del vector: " + mundialesSigloXXI.get(i));
        }
    }

}
