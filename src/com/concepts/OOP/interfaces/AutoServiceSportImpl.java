package com.concepts.OOP.interfaces;

import com.concepts.OOP.Models.Vehiculo;
import com.concepts.OOP.Models.herencia.Auto;

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
