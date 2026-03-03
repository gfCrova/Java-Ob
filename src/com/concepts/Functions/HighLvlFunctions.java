package com.concepts.Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HighLvlFunctions {

    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 50;

        // Uso de la función lambda 'toMayus' para convertir una cadena a mayúsculas
        System.out.println(toMayus.apply("hola mundo"));

        // Uso de la función lambda 'sumador' para sumar un número consigo mismo
        System.out.println(sumador.apply(num1));

        // Llamada a la función 'applyFunction' pasando 'toMayus' como argumento
        applyFunction(toMayus, "Funciones de alto nivel");

        // Uso de la función 'sumaFuncional' para sumar números en un rango
        System.out.println("La suma total entre los numeros " + num1 + " y " + num2 + " es de: " + sumaFuncional(num1, num2));

        // Creación de una lista de nombres
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Hernán", "Gustavo", "Federico"));
        System.out.println(nombres);

        // STREAM
        // Uso de stream() para convertir la lista en un flujo de datos y map() para transformar cada elemento
        Stream<String> namesMayus = nombres.stream().map(toMayus);
        namesMayus.forEach(x -> System.out.println("Nombre: " + x));

        // Uso de filter() para filtrar nombres que comienzan con "G" y map() para transformarlos
        Stream<String> filterNombres = nombres.stream().filter(x -> x.startsWith("G")).map(x -> "Nombre Filtrado: " + x);
        filterNombres.forEach(System.out::println);

        // Uso de reduce() para sumar números pares en un array
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumaTotal = Arrays.stream(numeros).filter(x -> x % 2 == 0).reduce(0, (x, y) -> {
            System.out.println("Sumando: " + x + " + " + y);
            return Integer.sum(x, y);
        });
        System.out.println("Suma de los números pares: " + sumaTotal);
    }

    // Función lambda: Convierte una cadena a mayúsculas
    public static Function<String, String> toMayus = String::toUpperCase;

    // Función lambda: Suma un número consigo mismo
    public static Function<Integer, Integer> sumador = (x) -> Integer.sum(x, x);

    /**
     * Aplica una función a un valor dado y muestra el resultado.
     * @param saluda Función que toma un String y devuelve un String.
     * @param value Valor al que se aplicará la función.
     */
    public static void applyFunction(Function<String, String> saluda, String value) {
        String result = saluda.apply(value);
        System.out.println(result);
    }

    /**
     * Suma los números en un rango dado utilizando programación funcional.
     * @param num1 Inicio del rango (inclusive).
     * @param num2 Fin del rango (inclusive).
     * @return La suma de los números en el rango.
     */
    public static int sumaFuncional(int num1, int num2) {
        return IntStream.rangeClosed(num1, num2) // Genera un stream de enteros desde num1 hasta num2 (inclusive).
                .reduce(0, (a, b) -> a + b); // Suma los elementos del stream.
    }

}
