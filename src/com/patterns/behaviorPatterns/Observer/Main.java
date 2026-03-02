package com.patterns.behaviorPatterns.Observer;

public class Main {
    public static void main(String[] args) {

        Emisora emisora = new Emisora();

        ReceptorTV receptorTV = new ReceptorTV();
        ReceptorRadio receptorRadio = new ReceptorRadio();
        ReceptorSatelite receptorSatelite = new ReceptorSatelite();

        emisora.addReceptor(receptorTV);
        emisora.addReceptor(receptorRadio);
        emisora.addReceptor(receptorSatelite);

        emisora.emitirNotificacion();
    }
}
