package com.concepts.ControlOperators;

public class Condicionales {

    public static void main(String[] args) {

        edadFunction(16);
        diaSemana(5);
    }

    // If - Else If - Else

    static void edadFunction(int edad) {
        if (edad >= 18) {
            System.out.println("Usted ya es mayor de edad.");
        } else if (edad > 0) {
            System.out.println("Todavía no es mayor de edad.");
        } else {
            System.out.println("Número no válido.");
        }
    }

    // Switch

    static void diaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido.");
        }
    }
}
