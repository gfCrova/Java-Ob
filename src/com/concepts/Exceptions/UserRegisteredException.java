package com.concepts.Exceptions;

public class UserRegisteredException extends UserException {
    public UserRegisteredException(String name) {
        super("User already registered : " + name);
    }
}
