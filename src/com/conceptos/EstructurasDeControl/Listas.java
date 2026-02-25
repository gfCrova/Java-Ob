package com.conceptos.EstructurasDeControl;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listas {

    public static void main(String[] args) {

        /*  ------------------------------ ArrayList ------------------------------
           ArrayList es una clase que implementa la interfaz List y se utiliza para almacenar elementos de manera dinámica.
           A diferencia de los arrays, los ArrayList pueden crecer o reducir su tamaño automáticamente según sea necesario.
        */
        ArrayList<String> lista = new java.util.ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        System.out.println(lista);

        /*  ------------------------------ LinkedList ------------------------------
           LinkedList es otra implementación de la interfaz List que utiliza una estructura de datos de lista enlazada.
            diferencia de ArrayList, LinkedList es más eficiente para operaciones de inserción y eliminación, pero puede ser menos eficiente para acceder a elementos por índice.
        */
        LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("Elemento A");
        linkedList.add("Elemento B");
        linkedList.add("Elemento C");

        System.out.println(linkedList);
    }

}
