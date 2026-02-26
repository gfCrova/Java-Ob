package com.conceptos.TiposDeDatos;

import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        /*  ------------------------------ Vectores ------------------------------
            Un vector es una estructura de datos que almacena una colección de elementos del mismo tipo en una ubicación contigua en memoria.
            A diferencia de los arrays, los vectores pueden crecer o reducir su tamaño automáticamente según sea necesario.
         */

        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(5);
        vector.add(6);
        vector.add(9);
        vector.add(3);
        System.out.println(vector);

        // Inicializar un vector con una capacidad específica
        Vector<String> vectorConCapacidad = new Vector<>(5); // Crea un vector con una capacidad inicial de 5 elementos

        // Capacidad de incremento
        Vector<Double> vectorConIncremento = new Vector<>(5, 3); // Crea un vector con una capacidad inicial de 5 elementos y un incremento de capacidad de 3 elementos

            // size()
        System.out.println("El tamaño del vector es: " + vector.size()); // Devuelve el número de elementos en el vector
            // capacity()
        System.out.println("La capacidad del vector es: " + vector.capacity()); // Devuelve la capacidad actual del vector, es decir, el número de elementos que puede contener antes de necesitar redimensionarse.
            // get()
        System.out.println("El elemento en la posición 2 es: " + vector.get(2)); // Devuelve el elemento en la posición especificada

            // remove()
        vector.remove(1); // Elimina el elemento en la posición especificada (en este caso, el elemento en la posición 1, que es el número 5)
        System.out.println("El vector después de eliminar el elemento en la posición 1 es: " + vector);

            // Incrementar la capacidad del vector
        vector.ensureCapacity(10); // Aumenta la capacidad del vector a al menos el número especificado (en este caso, 10)
        System.out.println("La capacidad del vector después de asegurar una capacidad de 10 es: " + vector.capacity());

            // Reducir la capacidad del vector al tamaño actual
        vector.trimToSize(); // Reduce la capacidad del vector al número actual de elementos
        System.out.println("La capacidad del vector después de reducirla al tamaño actual es: " + vector.capacity());

            // clear()
       // vector.clear(); // Elimina todos los elementos del vector, dejándolo vacío
        System.out.println("El vector después de limpiar todos los elementos es: " + vector);


        // Recorrer un vector utilizando un bucle for

        for(int i : vector) {
            System.out.println("Valor es: " + i);
        }

        for (int i = 0; i < vector.size(); i++) {
            System.out.print("Valor es: " + vector.get(i) + "\n");
        }

    }
}
