package com.conceptos.Clases;

public class AutoElectrico extends Auto {
    String motorElectrico;

    public AutoElectrico(){
    }

    // SUPER CONSTRUCTOR


    public AutoElectrico(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, Motor motor, String motorElectrico) {
        super(color, modelo, fabricante, peso, largo, velocidad, motor);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "Motor Electrico = '" + motorElectrico + '\'' +
                ", Color = '" + color + '\'' +
                ", Modelo = '" + modelo + '\'' +
                ", Fabricante = '" + fabricante + '\'' +
                ", Peso = " + peso +
                ", Largo = " + largo +
                ", Velocidad = " + velocidad +
                ", Motor = " + motor +
                '}';
    }

    // SOBREESCRITURA DE MÉTODO
    @Override
    public void acelerar(int cantidad){
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }
}
