package com.concepts.OOP.Models;

public class VehiculoAuto extends Vehiculo {

    public VehiculoAuto(){
    }

    // SUPER CONSTRUCTOR
    // El constructor de la clase padre se llama utilizando la palabra clave "super" seguida de los parámetros necesarios.
    public VehiculoAuto(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor, String electricMotor) {
        super(color, modelo, fabricante, peso, largo, velocidad, motor);
    }

    // SOBREESCRITURA DE METODO
    /*@Override
    public void acelerar(int cantidad){
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }*/

    @Override
    public String toString() {
        return "Automóvil: " +
                super.toString();
    }
}
