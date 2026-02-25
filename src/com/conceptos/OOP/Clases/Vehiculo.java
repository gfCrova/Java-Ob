package com.conceptos.OOP.Clases;

// Class ABSTRACT No se puede INSTANCIAR, solo las herencias
public class Vehiculo {

    // ATRIBUTOS DE LA CLASE
    // Atributos privados para encapsulamiento (controlar el acceso a los datos)
    private String color;
    private String modelo;
    private String fabricante;
    private Double peso;
    private Double largo;
    private int velocidad;
    private Motor motor;

    // CONSTRUCTORES
    // Constructor por defecto (sin parámetros)
    public Vehiculo() {
    }

    // Constructor con parámetros (sobrecarga de constructores)
    public Vehiculo(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad) {
        this.setColor(color);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setPeso(peso);
        this.setLargo(largo);
        this.setVelocidad(velocidad);
    }

    // Constructor con parámetros (sobrecarga de constructores) - CON MOTOR
    public Vehiculo(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor) {
        this.setColor(color);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setPeso(peso);
        this.setLargo(largo);
        this.setVelocidad(velocidad);
        this.setMotor(motor);
    }

    /* MÉTODOS (Comportamiento)
    Recibe una cantidad de aceleración y la suma a la velocidad actual del vehículo.
    Si la cantidad es negativa o mayor a 500, no se realiza ningún cambio en la velocidad. */

    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 500) {
            this.setVelocidad(this.getVelocidad() + cantidad);
        }
    }

    // Este metodo desacelera el vehículo restando la cantidad a la velocidad actual, pero no permite que la velocidad sea negativa.
    public void desacelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 500) {
            int nuevaVelocidad = this.getVelocidad() - cantidad;
            if (nuevaVelocidad < 0) {
                this.setVelocidad(0);
            } else {
                this.setVelocidad(nuevaVelocidad);
            }
        }
    }

    // SETTERS  -  GETTERS
    // Encapsulamiento: Controlar el acceso a los atributos a través de métodos públicos (getters y setters)

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

    // toString para mostrar la información del vehículo
    @Override
    public String toString() {
        return "{ \n" +
                "\tFabricante = '" + getFabricante() + '\n' +
                "\tModelo = '" + getModelo() + '\n' +
                "\tColor = '" + getColor() + '\n' +
                "\tPeso = " + getPeso() + '\n' +
                "\tLargo = " + getLargo() + '\n' +
                "\tVelocidad = " + getVelocidad() + '\n' +
                "\tMotor = " + getMotor() + '\n' +
                "}";
    }
}