package com.concepts.OOP.Models;

public class Main {

    public static void main(String[] args) {

        Motor motorGTI = new Motor("GTI 1.6", 8, 190);
        Motor suzuki1123 = new Motor("suzuki1123", 1, 10);

        // INSTANCIA CONSTRUCTOR VACÍO (SUPER)
        VehiculoAuto Chevrolet = new VehiculoAuto();
        Chevrolet.setModelo("Corsa");
        Chevrolet.setColor("Azul");
        Chevrolet.setPeso(1600.00);
        Chevrolet.setLargo(5.0);
        Chevrolet.setFabricante("Chevrolet");
        Chevrolet.setVelocidad(90);
        Chevrolet.setMotor(motorGTI);
        Chevrolet.acelerar(60);
        Chevrolet.desacelerar(50);

        // INSTANCIA CONSTRUCTOR CON PARÁMETROS (SUPER)
        VehiculoAuto Ford = new VehiculoAuto("Verde", "Focus", "Ford", 1650.80, 5.2, 50, motorGTI,"Motor 2.3");
        Ford.acelerar(80);

        VehiculoMoto motoSuzuki = new VehiculoMoto("Azul", "AX", "Suzuki", 400.00, 1.5, 80, "Calle", 100, 4, 2, suzuki1123);
        motoSuzuki.desacelerar(40);

        System.out.println(Chevrolet);
        System.out.println(Ford);
        System.out.println(motoSuzuki);
    }
}
