package com.PruebaCodewars.convertArrayToString;

import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {
        String newString = String.join(" ", words);
        System.out.println(newString);
        return newString;
    }
}