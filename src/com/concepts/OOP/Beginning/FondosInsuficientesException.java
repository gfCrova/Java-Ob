package com.concepts.OOP.Beginning;

/**
 *<h6>Excepción personalizada que se lanza cuando una cuenta no tiene fondos suficientes.</h6>
 *
 *  <li> Mejora profesional: </li>
 *  <li> Evita usar System.out.println</li>
 *  <li> Permite manejar errores correctamente</li>
 */
public class FondosInsuficientesException extends RuntimeException {

    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}
