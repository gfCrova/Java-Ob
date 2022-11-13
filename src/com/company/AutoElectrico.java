package com.company;

public class AutoElectrico extends Auto {
    String motorElectrico;

    public AutoElectrico(){
    }

    // SUPER CONSTRUCTOR
    public AutoElectrico(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, String motorElectrico){
        super(color, modelo, fabricante, largo, (double) velocidad);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
