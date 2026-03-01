package com.designPatterns.Creatives.Prototype;

public class Electrodomesticos implements Cloneable {

    public String nombre;
    public String marca;
    public int cantidad;

    public Electrodomesticos() {
    }

    //
    public Electrodomesticos clonar() throws CloneNotSupportedException{
        return (Electrodomesticos) this.clone();
    }
}
