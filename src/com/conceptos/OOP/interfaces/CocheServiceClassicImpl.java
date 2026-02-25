package com.conceptos.OOP.interfaces;

import com.conceptos.OOP.Clases.Vehiculo;
import com.conceptos.OOP.Clases.herencia.Auto;

public class CocheServiceClassicImpl implements ICoche {
    @Override
    public Vehiculo crearCocheDemo() {
        System.out.println("Classic Service");
        return new Auto();
    }

    @Override
    public void destruirCoche(Vehiculo auto) {
        System.out.println("Destruir Classic");
    }
}
