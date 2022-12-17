package com.ejercicioTEMA4;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("Apple", "IPhone 13 Pro Max", 2021, "Plateado", "IOS 15", 6.7, "Wi-Fi", 6, 256,12, 10, true);
        SmartWatch smartWatch1 = new SmartWatch("Xiaomi", "Mi Smart Band 6", 2022, "Negro", "Android 10", 1.56, "Bluetooth", "Silicona", "Deportiva", true);

        System.out.println(smartPhone1);
        System.out.println("\n");
        System.out.println(smartWatch1);
    }
}
