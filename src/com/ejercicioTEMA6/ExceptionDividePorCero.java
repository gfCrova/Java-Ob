package com.ejercicioTEMA6;

import java.lang.ArithmeticException;

public class Exception {

    public static void main(String[] args) {

        System.out.println(DividePorCero(4, 0));

    }

    public static int DividePorCero(int num1, int num2) throws ArithmeticException {
        int resultado = 0;
        try {
            return resultado = num1 / num2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
