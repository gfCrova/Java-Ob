package com.designPatterns.Creatives.Singleton;

public class Singleton {

    private static Singleton singleton;
    int contador;

    // Este constructor es privado para evitar que se puedan crear instancias desde fuera de la clase
    private Singleton() {}

    /*  Metodo para obtener la instancia única de la clase Singleton. Se utiliza el modificador (synchronized)
    para asegurar que solo un hilo pueda acceder a él a la vez, evitando problemas de concurrencia */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {  // Si no existe una instancia, se crea una nueva
            singleton = new Singleton();
        }
        return singleton; // Se devuelve la instancia única de la clase
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
