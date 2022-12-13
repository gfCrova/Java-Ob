package com.PruebaCodewars;

public class Kata {

    public static String solution(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--)
            str2 += str.charAt(i);
        return str2;
    }

}