package com.conceptos.Clases;

public class Auto {

    // ATRIBUTOS DE LA CLASE
    String color;
    String modelo;
    String fabricante;
    Double peso;
    Double largo;
    int velocidad;
    Motor motor;

    // CONSTRUCTORES

    public Auto() {
    }

    public Auto(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor) {
        this.color = color;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    // MÉTODOS (Comportamiento)
    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 500) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Color = '" + color + '\'' +
                ", Modelo = '" + modelo + '\'' +
                ", Fabricante = '" + fabricante + '\'' +
                ", Peso = " + peso +
                ", Largo = " + largo +
                ", Velocidad = " + velocidad +
                ", Motor = " + motor +
                '}';
    }


}