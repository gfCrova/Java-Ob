package com.conceptos.OOP.Clases;

import com.conceptos.OOP.Clases.herencia.Auto;
import com.conceptos.OOP.Clases.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        Motor motorGTI = new Motor("GTI 1.6", 8, 190);
        Motor suzuki1123 = new Motor("suzuki1123", 1, 10);

        // INSTANCIA CONSTRUCTOR VACÍO (SUPER)
        Auto Chevrolet = new Auto();
        Chevrolet.setModelo("Corsa");
        Chevrolet.setColor("Azul");
        Chevrolet.setPeso(1600.00);
        Chevrolet.setLargo(5.0);
        Chevrolet.setFabricante("Chevrolet");
        Chevrolet.setVelocidad(90);
        Chevrolet.setMotor(motorGTI);
        Chevrolet.acelerar(150);

        // INSTANCIA CONSTRUCTOR CON PARÁMETROS (SUPER)
        Auto Ford = new Auto("Verde", "Focus", "Ford", 1650.80, 5.2, 50, motorGTI,"Motor 2.3");
        Ford.acelerar(200);

        Motocicleta motoSuzuki = new Motocicleta ("Azul", "AX", "Suzuki", 400.00, 1.5, 80, "Calle", 100, 4, 2, suzuki1123);

        System.out.println(Chevrolet);
        System.out.println(Ford);
        System.out.println(motoSuzuki);
    }
}
