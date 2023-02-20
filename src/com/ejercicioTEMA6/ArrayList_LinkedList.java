package com.ejercicioTEMA6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayList_LinkedList {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> listado = new ArrayList<String>();

        listado.add("Elemento1");
        listado.add("Elemento2");
        listado.add("Elemento3");
        listado.add("Elemento4");

        listado.remove(2);

        for (String elemento:listado) {
            System.out.println(elemento);
        }

        System.out.println("\n");

        // Convertir de ArrayList para LinkedList
        LinkedList<String> listadoCopiado = new LinkedList<String>(listado);

        for (String elemento:listadoCopiado) {
            System.out.println(elemento);
        }

        System.out.println("\n");

        // Convertir de ArrayList para Array
        String[] array = new String[listado.size()];
        for (int i = 0; i < listado.size(); i++) {
            array[i] = listado.get(i);
        }
        System.out.println(Arrays.toString(array));
    }

}
