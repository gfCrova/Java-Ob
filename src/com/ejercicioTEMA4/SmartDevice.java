package com.ejercicioTEMA4;

public abstract class SmartDevice {

    private String fabricante;
    private String modelo;
    private int anioLanzamiento;
    private String color;
    private String SO;
    private double sizePantalla;
    private String conectividad;


    public SmartDevice() {}

    public SmartDevice(String fabricante, String modelo, int anioLanzamiento, String color, String SO, double sizePantalla, String conectividad) {
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setAnioLanzamiento(anioLanzamiento);
        this.setColor(color);
        this.setSO(SO);
        this.setSizePantalla(sizePantalla);
        this.setConectividad(conectividad);
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public double getSizePantalla() {
        return sizePantalla;
    }

    public void setSizePantalla(double sizePantalla) {
        this.sizePantalla = sizePantalla;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return  "Fabricante = '" + getFabricante() + '\'' + '\n' +
                "Modelo = '" + getModelo() + '\'' + '\n' +
                "Año de lanzamiento = " + getAnioLanzamiento() + '\n' +
                "Color = " + getColor() + '\n' +
                "SO = '" + getSO() + '\'' + '\n' +
                "Tamaño Pantalla = " + getSizePantalla() + '\n' +
                "Conectividad = '" + getConectividad() + '\'';
    }
}
