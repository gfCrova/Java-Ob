package com.company;

public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto("red", "Honda", "civic", 1460.60, 5.0);

        auto1.acelerar(80);

        System.out.println(auto1);
    }
}
