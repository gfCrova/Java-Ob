package com.conceptos.OOP.interfaces;

import com.conceptos.OOP.Clases.Vehiculo;

public class InterfacesMain {
    public static void main(String[] args) {

        ICoche classic = new CocheServiceClassicImpl();
        ICoche sport = new CocheServiceSportImpl();

        Vehiculo auto1 = classic.crearCocheDemo();
        Vehiculo auto2 = sport.crearCocheDemo();

        sport.destruirCoche(auto1);
        classic.destruirCoche(auto2);
    }
}
