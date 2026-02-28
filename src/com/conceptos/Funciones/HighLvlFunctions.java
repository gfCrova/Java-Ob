package com.conceptos.Funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class HighLvlFunctions {

    // Función lambda: Expresión anónima que implementa una interfaz funcional (con un solo metodo abstracto).
    public static Function<String, String> toMayus = String::toUpperCase;

    // Función que suma un número consigo mismo usando Integer.sum que es un metodo estático que toma dos enteros y devuelve su suma.
    public static Function<Integer, Integer> sumador = (x) -> Integer.sum(x, x);

    // Funcion como parámetro: Función que recibe otra función como argumento.
    public static void applyFunction(Function<String, String> saluda, String value) {
        String result = saluda.apply(value);
        System.out.println("Resultado de aplicar la función: " + result);
    }

    public static void main(String[] args) {

        System.out.println(toMayus.apply("hola mundo"));
        System.out.println(sumador.apply(25));
        applyFunction(toMayus, "Funciones de alto nivel");

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

}
