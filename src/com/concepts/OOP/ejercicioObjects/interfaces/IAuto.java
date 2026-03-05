package com.concepts.OOP.ejercicioObjects.interfaces;
import com.concepts.OOP.ejercicioObjects.Models.Vehiculo;

/* INTERFAZ: Es un contrato que define un conjunto de métodos que una clase debe implementar. No tiene implementación, solo la firma de los métodos.
   Las clases que implementan la interfaz deben proporcionar la implementación de esos métodos. */
public interface IAuto {

    public Vehiculo crearAutoDemo();
    public void destruirAuto(Vehiculo auto);

}
