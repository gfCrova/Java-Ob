package com.conceptos.interfaces;

import com.conceptos.Clases.Auto;
import com.conceptos.Clases.AutoElectrico;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Auto crearAutoDemo(){
        System.out.println("Sport Service");
        return new AutoElectrico();
    }

    @Override
    public void destruirCoche(Auto auto) {
        System.out.println("Destruir Sport");
    }
}
