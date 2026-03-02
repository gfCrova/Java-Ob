package com.patterns.designPatterns.Structural.Decorator;

public class Celular implements ICelular {
    @Override
    public void crear() {
        System.out.println("Celular");
        tengoGSM();
        tengo4G();
    }

    public void tengoGSM() {
        System.out.println("-> Tengo GSM");
    }

    public void tengo4G() {
        System.out.println("    -> Tengo 4G");
    }
}