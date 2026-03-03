package com.concepts.Exceptions;

import java.lang.Exception;

public class UserException extends Exception {
    public UserException(String message) {
        super("(UserException) " + message);
    }
}
