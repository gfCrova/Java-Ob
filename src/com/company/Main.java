package com.company;

public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto("red", "Honda", "civic", 1460.60, 5.0);
        auto1.acelerar(80);
        System.out.println(auto1);


        AutoElectrico autoElectrico1 = new AutoElectrico();
        autoElectrico1.motorElectrico = "Motor 1.1";
        autoElectrico1.modelo = "Honda";
        autoElectrico1.color = "Azul";
        autoElectrico1.peso = 1600.00;
        autoElectrico1.largo = 5.0;
        autoElectrico1.fabricante = "civic";
        autoElectrico1.acelerar(100);
        System.out.println(autoElectrico1);
    }
}
