package com.conceptos.interfaces;

import com.conceptos.Clases.Auto;
import com.conceptos.Clases.AutoElectrico;

public class CocheServiceClassicImpl implements CocheService{
    @Override
    public Auto crearAutoDemo() {
        System.out.println("Classic Service");
        return new AutoElectrico();
    }

    @Override
    public void destruirCoche(Auto auto) {
        System.out.println("Destruir Classic");
    }
}
