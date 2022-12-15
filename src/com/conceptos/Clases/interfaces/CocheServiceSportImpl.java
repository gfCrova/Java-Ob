package com.conceptos.Clases.interfaces;

import com.conceptos.Clases.Vehiculo;
import com.conceptos.Clases.herencia.AutoElectrico;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Vehiculo crearAutoDemo(){
        System.out.println("Sport Service");
        return new AutoElectrico();
    }

    @Override
    public void destruirCoche(Vehiculo auto) {
        System.out.println("Destruir Sport");
    }
}
