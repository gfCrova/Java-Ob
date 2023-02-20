package com.ejercicioTEMA6;

import java.util.Vector;

public class manipularVector {

    public static void main(String[] args) {

        Vector<Integer> enteros = new Vector<>(6, 1);

        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);

        enteros.remove(1);
        enteros.remove(2);

        System.out.println(enteros.size() + ", " + enteros.capacity());
        enteros.trimToSize();
        System.out.println(enteros.size() + ", " + enteros.capacity());

        for (int i = 0; i < enteros.size(); i++) {
            System.out.println("Valor en la posición " + i + " del vector: " + enteros.get(i));
        }

    }
}
