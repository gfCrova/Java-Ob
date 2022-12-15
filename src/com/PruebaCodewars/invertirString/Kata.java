package com.PruebaCodewars.invertirString;

public class Kata {

    public static String solution(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--)
            str2 += str.charAt(i);
        System.out.println("Se obtuvo: " + str2 + ". Luego de invertir: " + str);
        return str2;
    }

}