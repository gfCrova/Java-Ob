package com.company;

public class AutoElectrico extends Auto {
    String motorElectrico;

    public AutoElectrico(){
        super();
    }

    public AutoElectrico(String motorElectrico) {
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
