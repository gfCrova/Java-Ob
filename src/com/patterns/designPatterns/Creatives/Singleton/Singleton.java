package com.patterns.designPatterns.Creatives.Singleton;
/**
 * Implementación del patrón Singleton con inicialización perezosa (lazy initialization).
 *
 * Garantiza que solo exista una instancia de la clase en toda la aplicación
 * y proporciona un punto global de acceso a ella.
 */
public class Singleton {

    private static volatile Singleton instance;
    int contador;

    private Singleton() {}   // Constructor privado para evitar instanciación directa

    /** Double-Checked Locking: para obtener la instancia única de la clase Singleton.
     *  1 - Hilo 1 entra al synchronized.
     *  2 - Crea la instancia.
     *  3 - Sale del bloque.
     *  4 - Hilo 2 entra después.
     *  5 - Si no hubiera segunda verificación → crearía otra instancia.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
