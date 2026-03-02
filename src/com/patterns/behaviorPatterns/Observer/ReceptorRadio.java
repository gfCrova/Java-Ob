package com.patterns.behaviorPatterns.Observer;

public class ReceptorRadio implements Receptor {
    @Override
    public void recibirNotificacion() {
        System.out.println("Señal recibida en radio");
    }
}
