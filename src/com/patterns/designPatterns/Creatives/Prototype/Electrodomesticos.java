package com.patterns.designPatterns.Creatives.Prototype;

public class Electrodomesticos implements Cloneable {

    public String nombre;
    public String marca;
    public int cantidad;

    public Electrodomesticos(String nombre, String marca, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    /** Este metodo sobrescribe el metodo clone() de la clase Object
    * y delega la creación de la copia al metodo super.clone().*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Este metodo encapsula la llamada a clone()
     * */
    public Electrodomesticos clonar() {
        try {
            return (Electrodomesticos) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar", e);
        }
    }
}
