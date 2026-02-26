package com.conceptos.TiposDeDatos;

import java.util.Arrays;

public class ArraysMethods {

    public static void main(String[] args) {

        // Arrays
        int[] numeros = {1, 2, 3, 4, 5};
        String[] nombres = {"Juan", "María", "Pedro"};
        boolean[] booleanos = {true, false, true};

        // Se puede crear un array con un tamaño específico y luego asignar valores a cada posición:
        int[] arrayUni = new int[5];
        arrayUni[0] = 10;
        arrayUni[1] = 20;
        arrayUni[2] = 30;
        arrayUni[3] = 40;
        arrayUni[4] = 50;

        // Array Bidimensional
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] arrayBidi = new int[2][4];
        arrayBidi[0][0] = 10;
        arrayBidi[0][1] = 20;
        arrayBidi[0][2] = 30;
        arrayBidi[0][3] = 40;
        arrayBidi[1][0] = 100;
        arrayBidi[1][1] = 200;
        arrayBidi[1][2] = 300;
        arrayBidi[1][3] = 400;

        // Recorrer un array bidimensional
        System.out.println("Recorriendo el arrayBidimencional:");
        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.print(arrayBidi[i][j] + " ");
            }
            System.out.println();
        }

         // Array Tridimensional
        int[][][] cubo = {
                {
                        {1, 2, 3, 4},
                        {30, 40, 50}
                },
                {
                        {520, 620},
                        {7590, 8590, 9590}
                }
        };

        // Metodos de arrays
            // length
        System.out.println("\nLongitud del array numeros: " + numeros.length); // Devuelve la longitud del array
            // toString
        System.out.println(Arrays.toString(numeros)); // Devuelve una representación en forma de cadena del array
            // sort
        Arrays.sort(numeros); // Ordena el array en orden ascendente
        System.out.println(Arrays.toString(numeros));
            // equals
        System.out.println("¿Los arrays 'numeros' y 'arrayUni' son iguales? " + Arrays.equals(numeros, arrayUni)); // Compara dos arrays y devuelve true si son iguales (mismo tamaño y mismos elementos en el mismo orden)
            // fill
        int[] numeros3 = new int[5];
        Arrays.fill(numeros3, 7); // Llena el array con el valor especificado (en este caso, 7)
        System.out.println("Array numeros3 lleno con el valor 7: " + Arrays.toString(numeros3));
            // copyOf
        int[] numeros4 = Arrays.copyOf(numeros, 3); // Copia el array numeros y crea un nuevo array con la longitud especificada (en este caso, 3). Si la longitud es menor que la del array original, se copian solo los primeros elementos. Si es mayor, los elementos adicionales se llenan con el valor predeterminado (0 para int).
        System.out.println("Array numeros4 copiado de numeros con longitud 3: " + Arrays.toString(numeros4));
             // copyOfRange
        int[] numeros5 = Arrays.copyOfRange(numeros, 1, 4); // Copia un rango de elementos del array numeros y crea un nuevo array con los elementos desde la posición inicial (inclusive) hasta la posición final (exclusiva). En este caso, se copian los elementos en las posiciones 1, 2 y 3.
        System.out.println("Array numeros5 copiado de numeros desde la posición 1 hasta la posición 4 (exclusiva): " + Arrays.toString(numeros5));
             // binarySearch
        int index = Arrays.binarySearch(numeros, 3); // Busca el elemento especificado (en este caso, 3) en el array numeros utilizando el algoritmo de búsqueda binaria. El array debe estar ordenado previamente para que este metodo funcione correctamente. Devuelve el indice del elemento si se encuentra, o un valor negativo si no se encuentra.
        System.out.println("El índice del elemento 3 en el array numeros es: " + index);
    }
}
