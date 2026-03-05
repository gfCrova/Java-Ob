package com.concepts.OOP.Beginning;

public class Main {

    public static void main(String[] args) {

        OperacionBancaria cuenta1 = new CuentaAhorro("001", 1000);
        OperacionBancaria cuenta2 = new CuentaCorriente("002", 1000, 500);

        try {

            cuenta1.retirar(1500);  // Lanza excepción
            cuenta2.retirar(1200);  // Funciona (usa descubierto)

        } catch (FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
    }
}
