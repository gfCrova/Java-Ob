package com.company.Clases;

import com.company.Clases.Auto;
import com.company.Clases.AutoElectrico;

public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto("red", "Honda", "civic", 1460.60, 5.0);
        auto1.acelerar(80);
        System.out.println(auto1);

        // INSTANCIA sin parametros
        AutoElectrico autoElectrico1 = new AutoElectrico();
        autoElectrico1.motorElectrico = "Motor 1.1";
        autoElectrico1.modelo = "Civic";
        autoElectrico1.color = "Azul";
        autoElectrico1.peso = 1600.00;
        autoElectrico1.largo = 5.0;
        autoElectrico1.fabricante = "Honda";
        autoElectrico1.velocidad = 90;
        autoElectrico1.acelerar(50);
        System.out.println(autoElectrico1);


        // INSTANCIA DE SUPER
        AutoElectrico autoElectrico2 = new AutoElectrico("Verde", "Civic", "Honda", 1650.80, 5.2, 50, "Motor 2.3");
        System.out.println(autoElectrico2);

        autoElectrico2.acelerar(200);
        System.out.println(autoElectrico2);
    }
}
