package com.patterns.behaviorPatterns.Iterator;

public class Main {
    public static void main(String[] args) {

        // Crear usuarios
        Usuarios usuarios = new Usuarios();
        usuarios.createUsuarios(new Usuario("Giancarlo", "Garcia", 22));
        usuarios.createUsuarios(new Usuario("Juan", "Perez", 56));
        usuarios.createUsuarios(new Usuario("Maria", "Garcia", 30));
        usuarios.createUsuarios(new Usuario("Lorena", "Hernandez", 25));

        // Crear iterador
        IUsuarioIterator iterador = usuarios.createIterator();

        // Mostrar todos los usuarios
        while (iterador.hasMore()) {
            Usuario usuario = iterador.next();
            System.out.println(usuario.getName() + " " + usuario.getLastname() + " " + usuario.getAge());
        }

        System.out.println("---------------------------------------------------------------");

        // Agregar un nuevo usuario
        usuarios.createUsuarios(new Usuario("Jerson", "Da Silva", 29));
        Usuario usuarioNext = iterador.next();
        System.out.println("User added: " + usuarioNext.getName() + " " + usuarioNext.getLastname() + " " + usuarioNext.getAge());

        System.out.println("---------------------------------------------------------------");

        // Eliminar el primer usuario
        System.out.println("User eliminated: " + iterador.get(0).getName() + " " + iterador.get(0).getLastname() + " " + iterador.get(0).getAge());
        iterador.remove(0);

        System.out.println("---------------------------------------------------------------");

        // Mostrar todos los usuarios
        while (iterador.hasMore()) {
            Usuario usuario2 = iterador.next();
            System.out.println(usuario2.getName() + " " + usuario2.getLastname() + " " + usuario2.getAge());
        }

        System.out.println("---------------------------------------------------------------");

        // Agregar un nuevo usuario
        usuarios.createUsuarios(new Usuario("Francisco", "Diaz", 43));
        Usuario usuarioNext2 = iterador.next();
        System.out.println("User added: " + usuarioNext2.getName() + " " + usuarioNext2.getLastname() + " " + usuarioNext2.getAge());

        // Resetear el iterador
        iterador.reset();

        System.out.println("---------------------------------------------------------------");

        // Mostrar todos los usuarios
        while (iterador.hasMore()) {
            Usuario usuario4 = iterador.next();
            System.out.println(usuario4.getName() + " " + usuario4.getLastname() + " " + usuario4.getAge());
        }
    }
}
