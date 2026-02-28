package com.conceptos.Funciones;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class RecursivedFunctions {

    public static void main(String[] args) {

        int numero = 10;

        // Llamada a la función recursiva para calcular el factorial
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);

        // Llamada a la función recursiva para calcular la serie de Fibonacci
        int fibo = fibonacci(numero);
        System.out.println("La serie de Fibonacci hasta el término " + numero + " es: " + fibo);
    }

    // Función recursiva para calcular el FACTORIAL de un número
    public static int factorial(int n) {
        if (n == 0) { return 1;
        } else { return n * factorial(n - 1); // Llamada recursiva para calcular el factorial de n-1
        }
    }

    // Funcion recursiva para calcular la serie de FIBONACCI
    public static int fibonacci(int n) {
        if (n <= 1) { return n;
        } else { return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva para calcular el Fibonacci de n-1 y n-2
        }
    }
}
