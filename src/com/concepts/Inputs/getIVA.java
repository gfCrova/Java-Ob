package com.concepts.Inputs;
import java.util.Scanner;

public class getIVA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        int numero = scan.nextInt();

        double iva = numero * 0.21;

        double sumaTotal = numero + iva;

        System.out.println("El resultado con IVA es: " + sumaTotal);
    }
}
