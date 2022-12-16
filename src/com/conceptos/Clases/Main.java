package com.conceptos.Clases;

import com.conceptos.Clases.herencia.AutoElectrico;
import com.conceptos.Clases.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        Motor motorGTI = new Motor("GTI 1.6", 8, 190);
        Motor motorGTIelectrico = new Motor("GTI electric", 0, 120);
        Motor suzuki1123 = new Motor("suzuki1123", 1, 10);

        // INSTANCIA CONSTRUCTOR CON PARÁMETROS
        Vehiculo autoHonda = new Vehiculo("red", "Civic", "Honda", 1460.60, 5.0, 200, motorGTI);
        autoHonda.acelerar(280);

        // INSTANCIA CONSTRUCTOR VACÍO (SUPER)
        AutoElectrico autoElectricoChevrolet = new AutoElectrico();
        autoElectricoChevrolet.setModelo("Corsa");
        autoElectricoChevrolet.setColor("Azul");
        autoElectricoChevrolet.setPeso(1600.00);
        autoElectricoChevrolet.setLargo(5.0);
        autoElectricoChevrolet.setFabricante("Chevrolet");
        autoElectricoChevrolet.setVelocidad(90);
        autoElectricoChevrolet.setMotor(motorGTIelectrico);
        autoElectricoChevrolet.setMotorElectrico("Motor 1.1");
        autoElectricoChevrolet.acelerar(150);

        // INSTANCIA CONSTRUCTOR CON PARÁMETROS (SUPER)
        AutoElectrico autoElectricoFord = new AutoElectrico("Verde", "Focus", "Ford", 1650.80, 5.2, 50, motorGTIelectrico,"Motor 2.3");
        autoElectricoFord.acelerar(200);

        Motocicleta motoSuzuki = new Motocicleta ("Azul", "AX", "Suzuki", 400.00, 1.5, 80, "Calle", 100, 4, 2, suzuki1123);

        System.out.println(autoHonda);
        System.out.println(autoElectricoChevrolet);
        System.out.println(autoElectricoFord);
        System.out.println(motoSuzuki);
    }
}
