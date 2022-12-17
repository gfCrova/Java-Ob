package com.conceptos.OOP.interfaces;

import com.conceptos.OOP.Clases.Vehiculo;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService classic = new CocheServiceClassicImpl();
        CocheService sport = new CocheServiceSportImpl();

        Vehiculo auto1 = classic.crearAutoDemo();
        Vehiculo auto2 = sport.crearAutoDemo();

        sport.destruirCoche(auto1);
        classic.destruirCoche(auto2);
    }
}
