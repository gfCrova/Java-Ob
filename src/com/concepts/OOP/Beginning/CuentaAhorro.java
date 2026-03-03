package com.concepts.OOP.Beginning;
/**
 * <h6>CuentaAhorro -> hereda de Cuenta.</h6>
 * <ul>
 * <h6>🔹 HERENCIA:</h6>
 * <li>Reutiliza estructura base.</li>
 * <h6>🔹 POLIMORFISMO:</h6>
 * <li>Implementa su propia lógica de retiro.</li>
 *</ul>
 */
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void retirar(double monto) {

        if (monto > getSaldo()) {
            throw new FondosInsuficientesException(
                    "Saldo insuficiente en Cuenta de Ahorro."
            );
        }

        debitar(monto);
    }
}
