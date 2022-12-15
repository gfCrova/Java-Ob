package com.conceptos.Clases;

public class Main {

    public static void main(String[] args) {

        Motor motorGTI = new Motor("GTI 1.6", 8, 190);
        Motor motorGTIelectrico = new Motor("GTI electric", 0, 120);

        // INSTANCIA CONSTRUCTOR CON PARÁMETROS
        Auto auto1 = new Auto("red", "Honda", "civic", 1460.60, 5.0, 200, motorGTI);
        auto1.acelerar(80);

        // INSTANCIA CONSTRUCTOR VACÍO (SUPER)
        AutoElectrico autoElectrico1 = new AutoElectrico();
        autoElectrico1.motorElectrico = "Motor 1.1";
        autoElectrico1.modelo = "Civic";
        autoElectrico1.color = "Azul";
        autoElectrico1.peso = 1600.00;
        autoElectrico1.largo = 5.0;
        autoElectrico1.fabricante = "Honda";
        autoElectrico1.velocidad = 90;
        autoElectrico1.motor = motorGTIelectrico;
        autoElectrico1.acelerar(50);

        // INSTANCIA CONSTRUCTOR CON PARÁMETROS (SUPER)
        AutoElectrico autoElectrico2 = new AutoElectrico("Verde", "Civic", "Honda", 1650.80, 5.2, 50, motorGTIelectrico,"Motor 2.3");
        autoElectrico2.acelerar(200);

        System.out.println(auto1);
        System.out.println(autoElectrico1);
        System.out.println(autoElectrico2);
    }
}
