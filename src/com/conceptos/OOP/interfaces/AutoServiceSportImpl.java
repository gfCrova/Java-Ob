package com.conceptos.OOP.interfaces;

import com.conceptos.OOP.Clases.Vehiculo;
import com.conceptos.OOP.Clases.herencia.Auto;

public class AutoServiceSportImpl implements IAuto {
    @Override
    public Vehiculo crearAutoDemo(){
        System.out.println("Sport Service");
        return new Auto();
    }

    @Override
    public void destruirAuto(Vehiculo auto) {
        System.out.println("Destruir Sport");
    }
}
