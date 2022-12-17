package com.conceptos.OOP.Clases.herencia;

import com.conceptos.OOP.Clases.Vehiculo;
import com.conceptos.OOP.Clases.Motor;

public class Auto extends Vehiculo {

    public Auto(){
    }

    // SUPER CONSTRUCTOR
    public Auto(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor, String motorElectrico) {
        super(color, modelo, fabricante, peso, largo, velocidad, motor);
    }

    // SOBREESCRITURA DE MÉTODO
    @Override
    public void acelerar(int cantidad){
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "Automóvil :" +
                super.toString();
    }
}
