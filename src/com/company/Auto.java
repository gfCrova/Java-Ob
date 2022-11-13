package com.company;

public class Auto {

    // ATRIBUTOS
    String color;
    String nombre;
    String fabricante;
    Double peso;
    Double largo;
    int velocidad;

    // CONSTRUCTOR
    public Auto(String color, String nombre, String fabricante, Double peso, Double largo) {
        this.color = color;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
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
                ", modelo='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }


}