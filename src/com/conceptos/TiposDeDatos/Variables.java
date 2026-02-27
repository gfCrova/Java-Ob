package com.conceptos.TiposDeDatos;

import java.math.BigDecimal;

public class Variables {

    public static void main(String[] args) {

        // Integers
        byte var1 = 2;
        short var2 = 15;
        int var3 = 140;
        long var4 = 5500000;
        System.out.println("\nENTEROS:\nTipo byte: " + var1 + "\nTipo short: " + var2 + "\nTipo int: " + var3 + "\nTipo long: " + var4);

        // Decimals
        float var5 = 1.5f;
        double var6 = 26.02d;
        System.out.println("\nDECIMALES:\nTipo float: " + var5 + "\nTipo double: " + var6);

        // Boolean
        boolean var7 = true;
        boolean var8 = false;
        System.out.println("\nBOOLEANOS:\nTipo boolean: " + var7 + "\nTipo boolean: " + var8);

        // String
        char var9 = 'A';
        String var10 = "Hola Mundo";
        System.out.println("\nTEXTO:\nTipo char: " + var9 + "\nTipo string: " + var10);

        // Como se usa printf        System.out.println("\nUSO DE PRINTF:");
        System.out.printf("\nEl valor de var1 es: %d", var1);
        System.out.printf("\nEl valor de var5 es: %.2f", var5);
        System.out.printf("\nEl valor de var7 es: %b", var7);
    }
}
