package com.conceptos.TiposDeDatos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {

        /*  ------------------------------ ArrayList ------------------------------
           ArrayList es una clase que implementa la interfaz List y se utiliza para almacenar elementos de manera dinámica.
           A diferencia de los arrays, los ArrayList pueden crecer o reducir su tamaño automáticamente según sea necesario.
        */
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        System.out.println(lista);

        // Metodos de ArrayList
            // size()
        System.out.println("El tamaño de la lista es: " + lista.size()); // Devuelve el número de elementos en la lista
            // get()
        System.out.println("El elemento en la posición 1 es: " + lista.get(1)); // Devuelve el elemento en la posición especificada
            // remove()
        lista.remove(0); // Elimina el elemento en la posición especificada (en este caso, el elemento en la posición 0, que es "Elemento 1")
        System.out.println("La lista después de eliminar el elemento en la posición 0 es: " + lista);
            // clear()
        lista.clear(); // Elimina todos los elementos de la lista, dejándola vacía
        System.out.println("La lista después de limpiar todos los elementos es: " + lista);

        /*  ------------------------------ LinkedList ------------------------------
           LinkedList es otra implementación de la interfaz List que utiliza una estructura de datos de lista enlazada.
            diferencia de ArrayList, LinkedList es más eficiente para operaciones de inserción y eliminación, pero puede ser menos eficiente para acceder a elementos por índice.
        */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Elemento A");
        linkedList.add("Elemento B");
        linkedList.add("Elemento C");

        System.out.println(linkedList);
    }

}
