package com.concepts.Args;

import java.util.HashMap;

public class OptionsParser {

    // Mapa donde se guardan las opciones y sus valores. Ej: "minval" -> "10"
    private final HashMap<String, String> options = new HashMap<>();

    // Array que va a contener los argumentos que llegan desde main(String[] args)
    private String[] args;

    public OptionsParser() {}

    public OptionsParser(String[] args) {
        this.args = args;
    }

    // Registramos una opción válida. Ej: "minval"
    public void registerParser(String optionName){
        options.put(optionName, null);
    }

    // Devuelve el valor de la opción
    public String getOption(String optionName) throws InvalidOptionException {
        if (!options.containsKey(optionName)) {
            throw new InvalidOptionException("La opción '" + optionName + "' no está registrada.");
        }

        return options.get(optionName);
    }

    // Cambia el valor de una opción ya registrada
    public void setOptionValue(String optionName, String optionValue) {
        options.replace(optionName, optionValue);
    }

    public void parse() throws InvalidOptionException {

        for (int i = 0; i < args.length; i++) {
            String rawArg = args[i];
            // Validamos que empiece con --
            if (!rawArg.startsWith("--")) {
                throw new InvalidOptionException("Formato inválido: " + rawArg);
            }
            // Quitamos los --
            String optionName = rawArg.substring(2);
            // Validamos que la opción exista
            if (!options.containsKey(optionName)) {
                throw new InvalidOptionException("Opción no reconocida: " + optionName);
            }
            // Validamos que exista un valor después
            if (i + 1 >= args.length) {
                throw new InvalidOptionException("Falta valor para la opción: " + optionName);
            }
            String optionValue = args[i + 1];
            options.put(optionName, optionValue); // Guardamos el valor
            i++;  // Saltamos el valor ya procesado
        }
    }
}
