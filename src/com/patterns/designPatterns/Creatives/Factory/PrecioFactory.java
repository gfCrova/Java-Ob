package com.patterns.designPatterns.Creatives.Factory;

public class PrecioFactory {

    private PrecioFactory() {} // Constructor privado para evitar instanciación

    // Este metodo decide qué objeto concreto crear y devuelve la interfaz común (Precio).
    public static Precio create(String tipoDeMoneda) {
        if (tipoDeMoneda.equalsIgnoreCase("USD")) {
            return new PrecioUSD();
        } else if (tipoDeMoneda.equalsIgnoreCase("EUR")) {
            return new PrecioEUR();
        } else {
            throw new IllegalArgumentException("Tipo de precio no soportado: " + tipoDeMoneda);
        }
    }
}
