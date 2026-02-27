package com.conceptos.Exceptions;

import java.lang.ArithmeticException;

public class Exception {

    public static void main(String[] args) {

        // Se maneja la excepción utilizando un bloque try-catch para capturar la excepción de tipo ArithmeticException que se produce al intentar dividir por cero.,
        try {
            System.out.println(DividePorCero(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error! No es posible realizar esta operación.");
        } finally {
            System.out.println("Esto se ejecuta siempre, haya o no una excepción.");
        }
    }

    // con throws ArithmeticException se indica que este metodo puede lanzar una excepcion de tipo ArithmeticException, que debe ser manejada por el código que llama a este metodo.
    public static int DividePorCero(int num1, int num2) throws ArithmeticException {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
