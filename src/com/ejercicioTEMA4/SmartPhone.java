package com.ejercicioTEMA4;

public class SmartPhone extends SmartDevice {

    private int memoriaRam;
    private int memoriaInterna;
    private int camaraFront;
    private int camaraBack;
    private boolean sensorHuella;

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, int anio, String color, String SO, double sizePantalla, String conectividad, int memoriaRam, int memoriaInterna, int camaraFront, int camaraBack, boolean sensorHuella) {
        super(fabricante, modelo, anio, color, SO, sizePantalla, conectividad);
        this.setMemoriaRam(memoriaRam);
        this.setMemoriaInterna(memoriaInterna);
        this.setCamaraFront(camaraFront);
        this.setCamaraBack(camaraBack);
        this.setSensorHuella(sensorHuella);
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaInterna() { return memoriaInterna; }

    public void setMemoriaInterna(int memoriaInterna) { this.memoriaInterna = memoriaInterna; }

    public int getCamaraFront() {
        return camaraFront;
    }

    public void setCamaraFront(int camaraFront) {
        this.camaraFront = camaraFront;
    }

    public int getCamaraBack() {
        return camaraBack;
    }

    public void setCamaraBack(int camaraBack) {
        this.camaraBack = camaraBack;
    }

    public boolean isSensorHuella() {
        return sensorHuella;
    }

    public void setSensorHuella(boolean sensorHuella) {
        this.sensorHuella = sensorHuella;
    }

    @Override
    public String toString() {
        return "SmartPhone: { " + '\n' +
                super.toString() + '\n' +
                "Memoria RAM = " + getMemoriaRam() + '\n' +
                "Memoria Interna = " + getMemoriaInterna() + '\n' +
                "Camara Frontal mpx = " + getCamaraFront() + '\n' +
                "Camara Trasera mpx = " + getCamaraBack() + '\n' +
                "Sensor Huella Dactilar = " + isSensorHuella() + '\n' +
                '}';
    }
}

