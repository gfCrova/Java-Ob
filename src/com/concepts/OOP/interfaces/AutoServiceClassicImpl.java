package com.concepts.OOP.interfaces;

import com.concepts.OOP.Models.Vehiculo;
import com.concepts.OOP.Models.VehiculoAuto;

public class AutoServiceClassicImpl implements IAuto {
    @Override
    public Vehiculo crearAutoDemo() {
        System.out.println("Classic Service");
        return new VehiculoAuto();
    }

    @Override
    public void destruirAuto(Vehiculo auto) {
        System.out.println("Destruir Classic");
    }
}
