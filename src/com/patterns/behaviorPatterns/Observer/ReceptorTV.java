package com.patterns.behaviorPatterns.Observer;

public class ReceptorTV implements Receptor {
    @Override
    public void recibirNotificacion() {
        System.out.println("Señal recibida en TV");
    }
}
