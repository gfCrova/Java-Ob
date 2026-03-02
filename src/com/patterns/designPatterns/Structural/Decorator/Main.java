package com.patterns.designPatterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {

        // En lugar de extender una clase con herencia, el decorador envuelve el objeto y agrega comportamiento adicional.
        CelularInteligente celularInteligente = new CelularInteligente(
                new Celular()
        );
        celularInteligente.crear();

        CelularNextGen celularNextGen = new CelularNextGen(
                new CelularInteligente(
                        new Celular()
                )
        );
        celularNextGen.crear();
    }
}
