package com.conceptos.TiposDeDatos;

import java.io.IOException;
import java.util.Arrays;

public class StringsMethods {

    public static void main(String[] args) {

        // Metodos para Strings
        String texto = "Hola Mundo";

        // .length()
        System.out.println(texto.length()); // Devuelve la longitud del string
        // .toUpperCase()
        System.out.println(texto.toUpperCase()); // Convierte el string a mayúsculas
        // .toLowerCase()
        System.out.println(texto.toLowerCase()); // Convierte el string a minúsculas
        // .charAt()
        System.out.println(texto.charAt(0)); // Devuelve el caracter en la posición especificada
        // .indexOf()
        System.out.println(texto.indexOf("Mundo")); // Devuelve la posición de la primera aparición del substring
        // .substring()
        System.out.println(texto.substring(0, 4)); // Devuelve una parte del string desde la posición inicial hasta la posición final (exclusiva)
        // endsWith()
        System.out.println(texto.endsWith("Mundo")); // Devuelve true si el string termina con el substring especificado
        // startsWith()
        System.out.println(texto.startsWith("Hola")); // Devuelve true si el string comienza con el substring especificado
        // contains()
        System.out.println(texto.contains("Mundo")); // Devuelve true si el string contiene el substring especificado
        // replace()
        System.out.println(texto.replace("Mundo", "Java")); // Reemplaza todas las apariciones del substring especificado con el nuevo substring
        // trim()
        String textoConEspacios = "   Hola Mundo   ";
        System.out.println(textoConEspacios.trim()); // Elimina los espacios en blanco al principio y al final del string
        // split()
        String[] palabras = texto.split(" "); // Divide el string en un array de substrings
        System.out.println(Arrays.toString(palabras)); // Devuelve una representación en forma de cadena del array

        reverse("Hola Mundo");
    }

    // Metodo para invertir un string
    public static void reverse(String str) {
        StringBuilder str2 = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            str2.append(str.charAt(i)); // Concatenar cada carácter del string original en orden inverso utilizando StringBuilder para mejorar el rendimiento.
        System.out.println("Texto invertido: " + str2 );
    }
}
