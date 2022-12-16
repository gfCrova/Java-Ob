package com.conceptos.Clases.herencia;

import com.conceptos.Clases.Motor;
import com.conceptos.Clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    private String tipo;
    private String cc;
    private int cajaDeCambios;

    private int tiempos;

    public Motocicleta(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, String tipo, String cc, int cajaDeCambios, int tiempos) {
        super(color, modelo, fabricante, peso, largo, velocidad);
        this.setTipo(tipo);
        this.setCajaDeCambios(cajaDeCambios);
        this.setCc(cc);
        this.setTiempos(tiempos);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
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
        return "Motocicleta{" +
                "tipo='" + getTipo() + '\'' +
                ", cc='" + getCc() + '\'' +
                ", cajaDeCambios=" + getCajaDeCambios() +
                ", tiempos=" + getTiempos() +
                '}';
    }
}
