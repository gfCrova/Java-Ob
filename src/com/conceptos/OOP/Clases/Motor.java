package com.conceptos.OOP.Clases;

public class Motor {

    private String modelo;
    private int cilindros;
    private int caballos;

    public Motor() {
    }

    public Motor(String modelo, int cilindros, int caballos) {
        this.setModelo(modelo);
        this.setCilindros(cilindros);
        this.setCaballos(caballos);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "{" +
                "Modelo = '" + getModelo() + '\'' +
                ", Cilindros = " + getCilindros() +
                ", Caballos = " + getCaballos() +
                '}';
    }
}
