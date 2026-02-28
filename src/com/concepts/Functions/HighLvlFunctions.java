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

        System.out.println(toMayus.apply("hola mundo"));
        System.out.println(sumador.apply(num1));
        applyFunction(toMayus, "Funciones de alto nivel");
        System.out.println("La suma total entre los numeros " + num1 + " y " + num2 + " es de: " + sumaFuncional(num1, num2));

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Hernán", "Gustavo", "Federico"));
        System.out.println(nombres);

        // STREAM
        // stream() convierte la lista en un flujo de datos que permite aplicar operaciones funcionales como map, filter, etc.
        // map() para transformar cada elemento de la lista usando la función toMayus.
        Stream<String> namesMayus = nombres.stream().map(toMayus);
        namesMayus.forEach(x -> System.out.println("Nombre: " + x));

        // filter()
        // Una vez que se ha consumido el stream, en este caso con el forEach(), no se puede volver a usar, por eso se crea otro stream para el filter.
        Stream<String> filterNombres = nombres.stream().filter(x -> x.startsWith("G")).map(x -> "Nombre Filtrado: " + x);
        filterNombres.forEach(System.out::println);

        // reduce()
        // Para reducir los elementos de un stream a un solo valor. En este caso, se filtran los números pares y luego se suman usando Integer::sum como función de reducción.
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumaTotal = Arrays.stream(numeros).filter(x -> x % 2 == 0).reduce(0, (x, y) -> {
            System.out.println("Sumando: " + x + " + " + y);
            return Integer.sum(x, y);
        });
        System.out.println("Suma de los números pares: " + sumaTotal);
    }

    // Función lambda: Expresión anónima que implementa una interfaz funcional (con un solo metodo abstracto).
    public static Function<String, String> toMayus = String::toUpperCase;

    // Función que suma un número consigo mismo usando Integer.sum que es un metodo estático que toma dos enteros y devuelve su suma.
    public static Function<Integer, Integer> sumador = (x) -> Integer.sum(x, x);

    // Funcion como parámetro: Función que recibe otra función como argumento.
    public static void applyFunction(Function<String, String> saluda, String value) {
        String result = saluda.apply(value);
        System.out.println(result);
    }

    // Función funcional para sumar los números del 'num1' al 'num2' utilizando IntStream
    public static int sumaFuncional(int num1, int num2) {
        return IntStream.rangeClosed(num1, num2) // rangeClosed() para generar un stream de enteros desde num1 hasta num2 (inclusive).
                .reduce(0, (a, b) -> a + b); // reduce() para sumar los elementos del stream, comenzando con un valor inicial de 0 y utilizando una función lambda que suma dos números (a y b).
    }

}
