package com.company.interfaces;

import com.company.Clases.Auto;
import com.company.Clases.AutoElectrico;

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
