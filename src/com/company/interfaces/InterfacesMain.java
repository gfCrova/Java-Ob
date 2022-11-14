package com.company.interfaces;

import com.company.Auto;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService classic = new CocheServiceClassicImpl();
        CocheService sport = new CocheServiceSportImpl();

        Auto auto1 = classic.crearAutoDemo();
        Auto auto2 = sport.crearAutoDemo();
    }
}
