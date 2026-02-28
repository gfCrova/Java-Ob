package com.conceptos.Funciones;

public class BasicsFunctions {

    public static void main(String[] args) {
        // Llamada a las funciones
        functionVoid();
        // Almacenando los resultados de las funciones con retorno en variables
        String str = functionString();
        int num = functionInt();
        // Imprimiendo los resultados
        System.out.println(str + "\n" + num);
        System.out.println(functionStringInt("Hernán", 29));
    }

    // Función sin retorno (void)
    static void functionVoid() {
        System.out.println("Hola, soy una función sin retorno (void).");
    }

    // Función con retorno de tipo String
    static String functionString() {
        return "Hola, soy una función con retorno de tipo String.";
    }

    // Función con retorno de tipo int
    static int functionInt() {
        return 2026;
    }

    // Función con retorno y con parámetros de tipo String y int
    static String functionStringInt(String var1, int var2) {
        return "Mi nombre es " + var1 + " y tengo " + var2 + " años.";
    }

}
