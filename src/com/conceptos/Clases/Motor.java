package com.conceptos.Clases;

public class Motor {

    String modelo;
    int cilindros;
    int caballos;

    public Motor(String modelo, int cilindros, int caballos) {
        this.modelo = modelo;
        this.cilindros = cilindros;
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "Motor {" +
                "Modelo = '" + modelo + '\'' +
                ", Cilindros = " + cilindros +
                ", Caballos = " + caballos +
                '}';
    }
}
