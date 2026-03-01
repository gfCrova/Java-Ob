package com.designPatterns.Factory;
/*
     El patrón Factory nos permite la creación de objetos a través de una interfaz común, en este caso, la interfaz Precio.
     En el constructor de PrecioFactory, se recibe un parámetro que determina qué tipo de objeto Precio se va a crear.
     Si el tipo de moneda es "USD", se crea una instancia de PrecioUSD; si es "EUR", se crea una instancia de PrecioEUR. Si el tipo de moneda no es reconocido, se lanza una excepción IllegalArgumentException.
     Esto permite que el código cliente (en este caso, la clase Main) no tenga que preocuparse por los detalles de cómo se crean los objetos Precio, sino que simplemente solicite el tipo de precio que necesita.
*/
public class PrecioFactory {

    Precio precio;

    private PrecioFactory() {} // Constructor privado para evitar instanciación

    public PrecioFactory(String tipoDeMoneda) {
        if (tipoDeMoneda.equalsIgnoreCase("USD")) {
            precio = new PrecioUSD();
        } else if (tipoDeMoneda.equalsIgnoreCase("EUR")) {
            precio = new PrecioEUR();
        } else {
            throw new IllegalArgumentException("Tipo de precio no soportado: " + tipoDeMoneda);
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}
