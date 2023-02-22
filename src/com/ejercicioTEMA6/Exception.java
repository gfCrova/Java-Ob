package com.ejercicioTEMA6;

import java.lang.ArithmeticException;

public class Exception {

    public static void main(String[] args) {

        try {
            System.out.println(DividePorCero(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static int DividePorCero(int num1, int num2) throws ArithmeticException {
        int resultado;
        try {
            return resultado = num1 / num2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
