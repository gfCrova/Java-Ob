package com.ejercicioTEMA5;

import com.conceptos.OOP.Clases.Vehiculo;

public class Main {

    static CocheCRUD coche1 = new CocheCRUDimpl();

    public static void main(String[] args) {

        coche1.findAll();
        coche1.save(new Vehiculo());
        coche1.delete(new Vehiculo());
    }
}
