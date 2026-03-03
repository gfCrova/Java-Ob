/*
 * (LICENSE) Copyright (c) 2012 Nombre Apellido ....
 */
package com.concepts.Comments;
/**
 * Tipos de comentarios.
 *
 * @author Java + Intellij
 */
public class TiposDeComentarios {

    int num1 = 6;
    int num2 = 9;

    // TODO: Se usa para indicar que algo quedo pendiente

    // JAVADOC
    /**
     * @param value Param of method
     * @throws ArithmeticException Si la condición se cumple
     * @return boolean
     * @see <a href="https://www.google.com">...</a>
     * @since 01/03/2026
     *
     */
    public boolean comments(Boolean value) throws ArithmeticException {
        if((num1 / num2) == 0){
            throw new ArithmeticException();
        }
        return value;
    }
}

