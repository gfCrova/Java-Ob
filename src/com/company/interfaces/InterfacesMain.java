package com.company.interfaces;

import com.company.Clases.Auto;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService classic = new CocheServiceClassicImpl();
        CocheService sport = new CocheServiceSportImpl();

        Auto auto1 = classic.crearAutoDemo();
        Auto auto2 = sport.crearAutoDemo();

        sport.destruirCoche(auto1);
        classic.destruirCoche(auto2);
    }
}
