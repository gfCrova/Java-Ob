package com.company;

public class Auto {

    // ATRIBUTOS
    String color;
    String modelo;
    String fabricante;
    Double peso;
    Double largo;
    int velocidad;

    // CONSTRUCTORES

    //public Auto() {}

    // CONSTRUCTOR
    public Auto(String color, String modelo, String fabricante, Double peso, Double largo) {
        this.color = color;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
    }

    public Auto() {
    }

    //MÉTODOS
    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }


}