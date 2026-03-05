package com.concepts.OOP.ejercicioObjects.interfaces;

import com.concepts.OOP.ejercicioObjects.Models.Vehiculo;
import com.concepts.OOP.ejercicioObjects.Models.VehiculoAuto;

public class AutoServiceSportImpl implements IAuto {
    @Override
    public Vehiculo crearAutoDemo(){
        System.out.println("Sport Service");
        return new VehiculoAuto();
    }

    @Override
    public void destruirAuto(Vehiculo auto) {
        System.out.println("Destruir Sport");
    }
}
