package com.conceptos.Funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighLvlFunctions {

    public static void main(String[] args) {

        System.out.println(toMayus.apply("hola mundo"));
        System.out.println(sumador.apply(25));

        applyFunction(toMayus, "Funciones de alto nivel");

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Hernán", "Gustavo", "Federico"));

        // Uso de map para transformar cada elemento de la lista usando la función toMayus
        List<String> nombresMayus = nombres.stream().map(toMayus).collect(Collectors.toList());
        System.out.println("Nombres en mayúsculas: " + nombresMayus);
    }

    // Función lambda: Expresión anónima que implementa una interfaz funcional (con un solo metodo abstracto).
    public static Function<String, String> toMayus = String::toUpperCase;

    // Función que suma un número consigo mismo usando Integer.sum que es un metodo estático que toma dos enteros y devuelve su suma.
    public static Function<Integer, Integer> sumador = (x) -> Integer.sum(x, x);

    // Funcion como parámetro: Función que recibe otra función como argumento.
    public static void applyFunction(Function<String, String> saluda, String value) {
        String result = saluda.apply(value);
        System.out.println("Resultado de aplicar la función: " + result);
    }
}
