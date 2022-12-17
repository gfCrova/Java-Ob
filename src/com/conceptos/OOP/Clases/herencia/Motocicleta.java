package com.conceptos.OOP.Clases.herencia;

import com.conceptos.OOP.Clases.Motor;
import com.conceptos.OOP.Clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    private String tipo;
    private int cc;
    private int cajaDeCambios;
    private int tiempos;

    public Motocicleta(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, String tipo, int cc, int cajaDeCambios, int tiempos, Motor motor) {
        super(color, modelo, fabricante, peso, largo, velocidad);
        this.setTipo(tipo);
        this.setCajaDeCambios(cajaDeCambios);
        this.setCc(cc);
        this.setTiempos(tiempos);
        this.setMotor(motor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCajaDeCambios() {
        return cajaDeCambios;
    }

    public void setCajaDeCambios(int cajaDeCambios) {
        this.cajaDeCambios = cajaDeCambios;
    }

    public int getTiempos() {
        return tiempos;
    }

    public void setTiempos(int tiempos) {
        this.tiempos = tiempos;
    }

    @Override
    public String toString() {
        return "Moto:" +
                super.toString() +
                ", tipo = '" + getTipo() + '\'' +
                ", cc = " + getCc() +
                ", cajaDeCambios = " + getCajaDeCambios() +
                ", tiempos = " + getTiempos() +
                '}';
    }
}
