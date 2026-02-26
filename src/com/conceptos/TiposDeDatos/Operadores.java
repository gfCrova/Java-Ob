package com.conceptos.TiposDeDatos;

public class Operadores {

    public static void main(String[] args) {

        /*  Operadores Aritmeticos
            Suma, Resta, División, Multiplicación, Módulo
        */

        int num1 = 57;
        int num2 = 8;

        int resultSuma = num1 + num2;
        int resultResta = num1 - num2;
        int resultDivision = num1 / num2;
        int resultMultiplication = num1 * num2;
        int resultModulo = num1 % num2;

        System.out.println(
                "El resultado de la suma es: " + resultSuma + "\n" +
                "El resultado de la resta es: " + resultResta + "\n" +
                "El resultado de la división es: " + resultDivision + "\n" +
                "El resultado de la multiplicación es: " + resultMultiplication + "\n" +
                "El resultado del módulo es: " + resultModulo
        );

        /* Operadores de Comparación
            Mayor que (>), Menor que (<), Mayor o igual que (>=), Menor o igual que (<=), Igual a (==), Distinto de (!=)
        */

        boolean resultMayorQue = num1 > num2;
        boolean resultMenorQue = num1 < num2;
        boolean resultMayorIgualQue = num1 >= num2;
        boolean resultMenorIgualQue = num1 <= num2;
        boolean resultIgualA = num1 == num2;
        boolean resultDistintoDe = num1 != num2;

        System.out.println(
                "El resultado de la comparación Mayor que es: " + resultMayorQue + "\n" +
                "El resultado de la comparación Menor que es: " + resultMenorQue + "\n" +
                "El resultado de la comparación Mayor o igual que es: " + resultMayorIgualQue + "\n" +
                "El resultado de la comparación Menor o igual que es: " + resultMenorIgualQue + "\n" +
                "El resultado de la comparación Igual a es: " + resultIgualA + "\n" +
                "El resultado de la comparación Distinto de es: " + resultDistintoDe
        );

        /*
        * Operadores Lógicos
            AND (&&), OR (||), NOT (!)
        * */

        boolean resultAND = (num1 > num2) && (num1 != num2);
        boolean resultOR = (num1 < num2) || (num1 == num2);
        boolean resultNOT = !(num1 == num2);

        System.out.println(
                "El resultado del operador AND es: " + resultAND + "\n" +
                "El resultado del operador OR es: " + resultOR + "\n" +
                "El resultado del operador NOT es: " + resultNOT
        );
    }

}
