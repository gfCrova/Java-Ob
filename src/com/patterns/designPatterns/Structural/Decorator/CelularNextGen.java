package com.patterns.designPatterns.Structural.Decorator;

public class CelularNextGen extends CelularDecorator {

    public CelularNextGen(ICelular celular) {
        super(celular);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("            -> NextGen: Tengo 6G");
    }
}
