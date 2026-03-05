package com.concepts.OOP.Models;

public class VehiculoMoto extends Vehiculo {

    private String tipo;
    private int cc;
    private int cajaDeCambios;
    private int tiempos;

    public VehiculoMoto(String color, String modelo, String fabricante, Double peso, Double largo, int velocidad, String tipo, int cc, int cajaDeCambios, int tiempos, Motor motor) {
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
        String parent = super.toString();
        return  "Moto: " + parent.substring(0, parent.length() - 1) +
                "\tTipo = '" + getTipo() + '\n' +
                "\tCC = " + getCc() + '\n' +
                "\tCaja De Cambios = " + getCajaDeCambios() + '\n' +
                "\tTiempos = " + getTiempos() + '\n' +
                '}';
    }
}
