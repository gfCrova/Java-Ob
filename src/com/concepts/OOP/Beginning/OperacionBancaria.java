package com.concepts.OOP.Beginning;
/**
 * <h6>🔹 ABSTRACCIÓN mediante INTERFAZ</h6>
 *
 * <li>Define el contrato que toda cuenta bancaria debe cumplir.</li>
 * <li>No tiene implementación.</li>
 */
public interface OperacionBancaria {

    void depositar(double monto);

    void retirar(double monto);

    double getSaldo();
}