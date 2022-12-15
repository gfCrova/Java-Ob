package com.conceptos.Clases;

public class Motor {

    private final String modelo;
    private final int cilindros;
    private final int caballos;

    public Motor(String modelo, int cilindros, int caballos) {
        this.modelo = modelo;
        this.cilindros = cilindros;
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "{" +
                "Modelo = '" + modelo + '\'' +
                ", Cilindros = " + cilindros +
                ", Caballos = " + caballos +
                '}';
    }
}
