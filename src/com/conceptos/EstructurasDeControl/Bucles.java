package com.conceptos.EstructurasDeControl;

import java.util.Arrays;

public class Bucles {

    public static void main(String[] args) {

        /* ------------------------------------- FOR  ------------------------------------------
        ****************************************************************************************
        El bucle for se utiliza cuando conocemos de antemano el número de iteraciones que queremos realizar.
        Se compone de tres partes: la inicialización, la condición y la actualización. */
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración del bucle for: " + i);
        }

        // Iterar un "array" con un bucle for
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numero : numeros) {
            System.out.println("Número en el array: " + numero);
        }

        // "Sumar" los números
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma de los números en el array es: " + suma);

        /* -------------------------------------- WHILE --------------------------------------
        **************************************************************************************
        El bucle while se utiliza cuando no conocemos el número de iteraciones de antemano
        y queremos repetir un bloque de código mientras se cumpla una condición. */
        int j = 0;
        while (j < 5) {
            System.out.println("Iteración del bucle while: " + j);
            j++;
            if (j == 3) {
                System.out.println("¡Llegamos a la mitad del bucle while!");
                break;
            }

        }

        /* ------------------------------------- DO-WHILE -------------------------------------
        ***************************************************************************************
        El bucle do-while es similar al while, pero garantiza que el bloque de código se ejecute al menos una vez. */
        int k = 0;
        do {
            System.out.println("Iteración del bucle do-while: " + k);
            k++;
        } while (k < 5);

        /* -------------------------------------- FOR EACH -------------------------------------
        ****************************************************************************************
        El bucle for-each se utiliza para iterar sobre elementos de una colección o un array de manera más sencilla y legible.
        No requiere una variable de índice, ya que itera directamente sobre los elementos.
        */
        String[] nombres = {"Julia", "José", "María", "Nahuel"};
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

    }

}
