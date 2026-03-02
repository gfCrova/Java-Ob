package com.patterns.behaviorPatterns.Iterator;

import java.util.ArrayList;

public class UsuarioIterador implements IUsuarioIterator {

    private ArrayList<Usuario> usuarios;
    private int position = 0;
    
    public UsuarioIterador(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    // Retorna el siguiente usuario en la lista
    @Override
    public Usuario next(){
        Usuario usuario = usuarios.get(position);
        position++;
        return usuario;
    }

    // Retorna true si hay más usuarios en la lista
    @Override
    public boolean hasMore(){
        return position < usuarios.size();
    }

    // Resetea la posicion del iterador
    @Override
    public void reset(){
        position = 0;
    }

    // Elimina el usuario actual
    @Override
    public void remove(int position){
        this.position = position;
        usuarios.remove(position);
    }

    // Metodo para acceder a un usuario en una posición específica
    @Override
    public Usuario get(int position){
        return usuarios.get(position);
    }
}
