package com.concepts.OOP.ejercicioObjects.interfaces;

import com.concepts.OOP.ejercicioObjects.Models.Vehiculo;

/* Se define una interfaz ICoche con dos metodos: crearCocheDemo() y destruirCoche(Vehiculo auto).
   Luego, se crean dos implementaciones de esta interfaz: CocheServiceClassicImpl y CocheServiceSportImpl, cada una con su propia lógica para crear y destruir coches.
   En el metodo main, se crean instancias de ambas implementaciones y se llaman a los métodos para crear y destruir coches.
   Esto demuestra cómo las interfaces permiten definir un contrato común para diferentes implementaciones, lo que facilita la flexibilidad y la extensibilidad del código. */
public class InterfacesMain {
    public static void main(String[] args) {

        IAuto classic = new AutoServiceClassicImpl();
        IAuto sport = new AutoServiceSportImpl();

        Vehiculo auto1 = classic.crearAutoDemo();
        Vehiculo auto2 = sport.crearAutoDemo();

        sport.destruirAuto(auto1);
        classic.destruirAuto(auto2);
    }
}
