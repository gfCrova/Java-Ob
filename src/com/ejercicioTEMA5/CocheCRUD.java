package com.ejercicioTEMA5;

import com.conceptos.OOP.Clases.Vehiculo;

import java.util.List;

public interface CocheCRUD {

    void save(Vehiculo coche);
    void delete(Vehiculo coche);

    List<Vehiculo> findAll();
}
