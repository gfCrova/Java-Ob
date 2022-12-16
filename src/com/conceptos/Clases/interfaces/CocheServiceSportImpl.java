package com.conceptos.Clases.interfaces;

import com.conceptos.Clases.Vehiculo;
import com.conceptos.Clases.herencia.Auto;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Vehiculo crearAutoDemo(){
        System.out.println("Sport Service");
        return new Auto();
    }

    @Override
    public void destruirCoche(Vehiculo auto) {
        System.out.println("Destruir Sport");
    }
}
