package com.ejercicioTEMA6;

import java.io.IOException;

public class ReverseString {

    public static void main(String[] args) {

        try {
            reverse("Hola Mundo");
        } catch (IOException e) {
            System.out.println("No se pudo invertir el string: " + e.getMessage());
        }
    }

    public static void reverse(String str) throws IOException {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--)
            str2 += str.charAt(i);
        System.out.println("Texto invertido: " + str2 );
    }
}
