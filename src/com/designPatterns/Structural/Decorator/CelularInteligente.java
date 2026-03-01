package com.designPatterns.Structural.Decorator;

public class CelularInteligente extends CelularDecorator {

    public CelularInteligente(ICelular celular) {
        super(celular);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("        -> Inteligente: Tengo 5G");
    }
}
