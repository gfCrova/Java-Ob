package com.concepts.interfaces;

import com.concepts.Clases.Auto;
import com.concepts.Clases.AutoElectrico;

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
