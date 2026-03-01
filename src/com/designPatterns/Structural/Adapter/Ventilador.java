package com.designPatterns.Structural.Adapter;

public class Ventilador {

    boolean prendido = false;
    int voltaje = 0;

    public void encenderVentilador(int volt) {
        prendido = true;
        voltaje = volt;
    }

    public void apagarVentilador() {
        prendido = false;
        voltaje = 0;
    }

    public boolean ventiladorPrendido() {
        return prendido;
    }
}
