package com.company;

public class Auto {

    // ATRIBUTOS
    String color;
    String nombre;
    String fabricante;
    Double peso;
    Double largo;
    Integer velocidad;

    // CONSTRUCTOR
    public Auto(String color, String nombre, String fabricante, Double peso, Double largo) {
        this.color = color;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
    }

    //MÉTODOS
    public void acelerar(Integer cantidad) {
        if (cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Clases{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }


}