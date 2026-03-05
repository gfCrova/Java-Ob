package com.concepts.Args;

public class InvalidOptionException extends Exception {
    public InvalidOptionException(String message){
        System.out.println("InvalidOptionException, " + message);
    }
}
