package com.concepts.Args;

public class Main {
    public static void main(String[] args) {
        /*
        java Main --minval 10 --maxval 100

        El array args queda así:

        args[0] = "--minval"
        args[1] = "10"
        args[2] = "--maxval"
        args[3] = "100"
        */

        OptionsParser optionsParser = new OptionsParser(args);
        optionsParser.registerParser("minval");
        optionsParser.registerParser("maxval");
        try {
            optionsParser.parse();
            String minval = optionsParser.getOption("minval");
            System.out.println("Minval es: " + minval);
            String maxval = optionsParser.getOption("maxval");
            System.out.println("Minval es: " + maxval);
        } catch (InvalidOptionException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
