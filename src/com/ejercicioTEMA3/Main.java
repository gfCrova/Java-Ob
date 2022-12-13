package com.ejercicioTEMA3;
import java.util.Arrays;

/**
 * @author -Gian-
 * @// FIXME: 12/12/2022
 */
public class Main {
    public static void main(String[] args) {

        String[] marcasDeCoches = {"Ferrari", "Chevrolet", "Ford", "Honda", "Toyota", "Tesla"};
        System.out.println("\n" + Arrays.toString(marcasDeCoches) + "\n");

        int count = 1;
        for (String marca : marcasDeCoches) {
            String nuevaLista = count++ + " - " + marca;
            System.out.println(nuevaLista);
        }
    }
}