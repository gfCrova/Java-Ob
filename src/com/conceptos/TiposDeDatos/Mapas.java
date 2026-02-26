package com.conceptos.TiposDeDatos;

import java.util.HashMap;

public class Mapas {

    public static void main(String[] args) {

        /* ----------------------------------- Maps (HashMap) -----------------------------------
           Un mapa es una colección de pares clave-valor, donde cada clave es única y se utiliza para acceder a su valor asociado.
           En Java, la clase HashMap es una implementación común de la interfaz Map. */

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Clave1", 10); // Agrega un par clave-valor al mapa
        map.put("Clave2", 20);
        map.put("Clave3", 30);
        System.out.println(map);

        // Metodos de HashMap
            // size()
        System.out.println("El tamaño del mapa es: " + map.size()); // Devuelve el número de pares clave-valor en el mapa
            // get()
        System.out.println("El valor asociado a 'Clave2' es: " + map.get("Clave2")); // Devuelve el valor asociado a la clave especificada
            // remove()
        map.remove("Clave1"); // Elimina el par clave-valor asociado a la clave especificada (en este caso, "Clave1")
        System.out.println("El mapa después de eliminar la clave 'Clave1' es: " + map);
            // replace()
        map.replace("Clave2", 25); // Reemplaza el valor asociado a la clave especificada con el nuevo valor (en este caso, reemplaza el valor asociado a "Clave2" con 25)
        System.out.println("El mapa después de reemplazar el valor asociado a 'Clave2' es: " + map);
            // containsKey()
        System.out.println("¿El mapa contiene la clave 'Clave3'? " + map.containsKey("Clave3")); // Devuelve true si el mapa contiene la clave especificada.
            // clear()
        map.clear(); // Elimina todos los pares clave-valor del mapa, dejándolo vacío
        System.out.println("El mapa después de limpiar todos los elementos es: " + map);

        // Iterar sobre un mapa utilizando un bucle for-each
        map.put("ClaveA", 100);
        map.put("ClaveB", 200);
        map.put("ClaveC", 300);

        for (String clave : map.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + map.get(clave));
        }
    }
}
