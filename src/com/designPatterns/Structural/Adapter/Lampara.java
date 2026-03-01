package com.designPatterns.Structural.Adapter;

public class Lampara implements Enchufable {
    boolean encendido = false;

    @Override
    public void enciende(){
        encendido = true;
    };

    @Override
    public void apaga(){
        encendido = false;
    }

    @Override
    public boolean estaEncendido(){
        return encendido;
    };
}
