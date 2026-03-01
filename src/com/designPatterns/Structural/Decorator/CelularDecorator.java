package com.designPatterns.Structural.Decorator;
/*
* Patrón Decorador: Envolver un objeto dentro de otro objeto que implementa la misma interfaz
*/
public abstract class CelularDecorator implements ICelular {

    protected ICelular celular;

    public CelularDecorator(ICelular celular) {
        this.celular = celular;
    }

    @Override
    public void crear() {
           this.celular.crear();
    }
}
