package com.conceptos.OOP.Clases;

// Class ABSTRACT No se puede INSTANCIAR, solo las herencias
public class Vehiculo {

    // ATRIBUTOS DE LA CLASE
    private String color;
    private String modelo;
    private String fabricante;
    private Double peso;
    private Double largo;
    private int velocidad;
    private Motor motor;

    // CONSTRUCTORES

    public Vehiculo() {
    }

    public Vehiculo(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad) {
        this.setColor(color);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setPeso(peso);
        this.setLargo(largo);
        this.setVelocidad(velocidad);
    }

    public Vehiculo(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor) {
        this.setColor(color);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setPeso(peso);
        this.setLargo(largo);
        this.setVelocidad(velocidad);
        this.setMotor(motor);
    }

    // MÉTODOS (Comportamiento)
    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 500) {
            this.setVelocidad(this.getVelocidad() + cantidad);
        }
    }

    // SETTERS  -  GETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return " { " +
                "Fabricante = '" + getFabricante() + '\'' +
                ", Modelo = '" + getModelo() + '\'' +
                ", Color = '" + getColor() + '\'' +
                ", Peso = " + getPeso() +
                ", Largo = " + getLargo() +
                ", Velocidad = " + getVelocidad() +
                ", Motor = " + getMotor() +
                " } ";
    }
}