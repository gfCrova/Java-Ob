package com.concepts.OOP.Models.herencia;

import com.concepts.OOP.Models.Vehiculo;
import com.concepts.OOP.Models.Motor;

public class Auto extends Vehiculo {

    public Auto(){
    }

    // SUPER CONSTRUCTOR
    // El constructor de la clase padre se llama utilizando la palabra clave "super" seguida de los parámetros necesarios.
    public Auto(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor, String electricMotor) {
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
