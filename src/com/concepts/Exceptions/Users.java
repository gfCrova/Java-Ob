package com.concepts.Exceptions;

import java.util.ArrayList;

public class Users {

    private final ArrayList<UserModel> users = new ArrayList<>();

    /**
     *  <ul>Agregar todos los usuarios a la lista</ul>
     *  <li> Se corrobora que la lista de usuarios no sea nula</li>
     *  <li> Que no se pueda agregar el mismo usuario más de una vez </li>
     *  <li> Que el usuario a agregar no sea nulo</li>
     */
    public void addAllUsers(UserModel ...users) throws UserException, NullPointerException {
        if (users == null){
            throw new NullPointerException("Users array cannot be null");
        }
        for (UserModel user : users){
            if (this.users.contains(user)){
                throw new UserRegisteredException(user.getName());
            }
            if (user.getName() == null){
                throw new NullPointerException("User name cannot be null: " + user.getName());
            }
            this.users.add(user);
            System.out.println("User added successfully: " + user.getName());
        }
    }
}
