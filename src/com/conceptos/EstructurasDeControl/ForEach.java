package com.conceptos.EstructurasDeControl;

public class ForEach {
    public static void main(String[] args) {

        int[] numeros = {5, 10, 15};

        int suma = 0;
        for (int numero : numeros) {
                suma += numero;
                System.out.println(suma);
        }


        String[] nombres = {"Julia", "José", "María", "Nahuel"};

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}
