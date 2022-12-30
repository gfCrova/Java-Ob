package com.ejercicioTEMA5;

import com.conceptos.OOP.Clases.Vehiculo;

import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    @Override
    public void save(Vehiculo coche) {
        System.out.println("Nuevo coche");
    }

    @Override
    public void delete(Vehiculo coche) {
        System.out.println("Delete coche");
    }

    @Override
    public List<Vehiculo> findAll() {
        return null;
    }
}
