package com.patterns.behaviorPatterns.Observer;

import java.util.ArrayList;

public class Emisora {
    private final ArrayList<Receptor> receptores = new ArrayList<>();

    // Agrega un receptor a la lista de receptores
    public void addReceptor(Receptor receptor){
        receptores.add(receptor);
    }

    // Notifica a todos los receptores sobre un evento o cambio
    public void emitirNotificacion(){
        for (Receptor receptor : receptores) {
            receptor.recibirNotificacion();
        }
    }

    public void removeReceptor(Receptor receptor){
        receptores.remove(receptor);
    }
}
