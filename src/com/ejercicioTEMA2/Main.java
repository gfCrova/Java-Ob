package com.ejercicioTEMA2;

public class Main {

    public static void main(String[] args) {
        // Option 1

        System.out.println(precioConIva(25000));
    }

    static String precioConIva(int cantidad) {
        int iva = 200;
        return "El total más IVA es de: $" + (cantidad + iva);
    }
}
