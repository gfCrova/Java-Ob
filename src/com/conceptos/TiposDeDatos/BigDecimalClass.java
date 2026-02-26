package com.conceptos.TiposDeDatos;

import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {

        /* -------------------------------------- BigDecimal --------------------------------------
           BigDecimal es una clase en Java que se utiliza para representar números decimales con una precisión arbitraria.
           Es especialmente útil para cálculos financieros o cuando se requiere una alta precisión en los cálculos decimales, ya que los tipos de datos primitivos como float y double pueden introducir errores de redondeo debido a su representación interna en binario.
           BigDecimal permite realizar operaciones aritméticas con una precisión controlada y es capaz de manejar números muy grandes o muy pequeños sin perder precisión. Para usar BigDecimal, es necesario importarla desde el paquete java.math.BigDecimal. */

        BigDecimal var11 = new BigDecimal("123456789.987654321");
        System.out.println("\nBIGDECIMAL:\nTipo BigDecimal: " + var11);

        // metodos de BigDecimal
        BigDecimal var12 = new BigDecimal("100.50");
        BigDecimal var13 = new BigDecimal("50.25");

        // add()
        BigDecimal suma = var12.add(var13); // Suma var12 y var13
        System.out.println("\nSuma: " + suma);

        // subtract()
        BigDecimal resta = var12.subtract(var13); // Resta var13 de var12
        System.out.println("Resta: " + resta);

        // multiply()
        BigDecimal multiplicacion = var12.multiply(var13); // Multiplica var12 por var13
        System.out.println("Multiplicación: " + multiplicacion);

        // divide()
        BigDecimal division = var12.divide(var13, 2, BigDecimal.ROUND_HALF_UP); // Divide var12 por var13 con una escala de 2 decimales y redondeo al alza.
        System.out.println("División: " + division);

        // setScale()
        BigDecimal var14 = new BigDecimal("123.456789");
        BigDecimal var14Redondeado = var14.setScale(2, BigDecimal.ROUND_HALF_UP); // Redondea var14 a 2 decimales con redondeo al alza
        System.out.println("Var14 redondeado a 2 decimales: " + var14Redondeado);

        // compareTo()
        int comparacion = var12.compareTo(var13); // Compara var12 con var13. Devuelve -1 si var12 es menor que var13, 0 si son iguales, y 1 si var12 es mayor que var13
        System.out.println("Comparación entre var12 y var13: " + comparacion);

    }
}
