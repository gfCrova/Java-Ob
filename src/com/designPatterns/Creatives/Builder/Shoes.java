package com.designPatterns.Creatives.Builder;

public class Shoes {

    private String marca;
    private String modelo;
    private int talla;

    public Shoes() {
    }

    public Shoes(String marca, int talla, String modelo) {
        this.marca = marca;
        this.talla = talla;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
}
