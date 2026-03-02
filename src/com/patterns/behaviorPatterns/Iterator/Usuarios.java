package com.patterns.behaviorPatterns.Iterator;

import java.util.ArrayList;

public class Usuarios implements IAggregate {


    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public void createUsuarios(Usuario usuario){
        usuarios.add(usuario);
    }

    public IUsuarioIterator createIterator(){
        return new UsuarioIterador(this.usuarios);
    }

}
