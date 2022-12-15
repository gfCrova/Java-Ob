package com.conceptos.Clases.herencia;

import com.conceptos.Clases.Vehiculo;
import com.conceptos.Clases.Motor;

public class AutoElectrico extends Vehiculo {
    private String motorElectrico;

    public String getMotorElectrico() {
        return motorElectrico;
    }

    public void setMotorElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public AutoElectrico(){
    }

    // SUPER CONSTRUCTOR
    public AutoElectrico(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor, String motorElectrico) {
        super(color, modelo, fabricante, peso, largo, velocidad, motor);
        this.setMotorElectrico(motorElectrico);
    }

    // SOBREESCRITURA DE MÉTODO
    @Override
    public void acelerar(int cantidad){
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }
}
