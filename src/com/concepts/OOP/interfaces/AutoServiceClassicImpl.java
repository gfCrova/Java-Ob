package com.concepts.OOP.interfaces;

import com.concepts.OOP.Models.Vehiculo;
import com.concepts.OOP.Models.herencia.Auto;

public class AutoServiceClassicImpl implements IAuto {
    @Override
    public Vehiculo crearAutoDemo() {
        System.out.println("Classic Service");
        return new Auto();
    }

    @Override
    public void destruirAuto(Vehiculo auto) {
        System.out.println("Destruir Classic");
    }
}
