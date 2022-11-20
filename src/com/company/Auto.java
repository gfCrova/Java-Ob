package com.company;

public class Auto {

    // ATRIBUTOS DE LA CLASE
    String color;
    String modelo;
    String fabricante;
    Double peso;
    Double largo;
    int velocidad;

    // CONSTRUCTORS

    public Auto() {
    }
    public Auto(String color, String modelo, String fabricante, Double peso, Double largo) {
        this.color = color;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
    }

    //MÉTODOS DE CLASE
    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 500) {
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