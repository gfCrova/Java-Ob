package com.concepts.OOP.Dto;

public class Main {
    public static void main(String[] args) {

        // Creando usuarios y sus vehículos
        User gian = new User("Gian");
        gian.addVehicle(new Vehicle("Moto"));

        User victoria = new User("Victoria");
        victoria.addVehicle(new Vehicle("Auto"));
        victoria.addVehicle(new Vehicle("Bicicleta"));

        // Creando lista de usuarios
        Users users = new Users();
        users.addUser(gian);
        users.addUser(victoria);

        // Obtener datos del usuario
        User user = users.obtenerUser("GIAN");
        System.out.println("Listando información del usuario:\n" + user.getName() + "\nVehículos:");
        for (Vehicle vehicle : user.getVehicles()) {
            System.out.println(vehicle.type);
        }
    }
}
