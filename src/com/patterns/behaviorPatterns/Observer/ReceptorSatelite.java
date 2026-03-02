package com.patterns.behaviorPatterns.Observer;

public class ReceptorSatelite implements Receptor {
    @Override
    public void recibirNotificacion() {
        System.out.println("Señal recibida en satélite");
    }
}
