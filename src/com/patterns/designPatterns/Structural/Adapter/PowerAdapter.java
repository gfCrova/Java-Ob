package com.patterns.designPatterns.Structural.Adapter;
/*
   El Patrón Adapter (Adaptador) es un patrón estructural que permite que dos interfaces incompatibles trabajen juntas.
*/
public class PowerAdapter implements Enchufable {

    public Ventilador ventilador;

    public PowerAdapter(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void enciende(){
        ventilador.encenderVentilador(220);
    }

    @Override
    public void apaga(){
        ventilador.apagarVentilador();
    }

    @Override
    public boolean estaEncendido(){
      return ventilador.ventiladorPrendido();
    }
}
