package com.concepts.OOP.Beginning;
/**
 * <h6>CuentaCorriente -> hereda de Cuenta.</h6>
 * <ul>
 * <h6>🔹 HERENCIA:</h6>
 * <li> Reutiliza atributos y métodos de Cuenta.</li>
 * <li> Extiende su comportamiento.</li>
 * <h6>🔹 POLIMORFISMO:</h6>
 * <li> Implementa su propia versión del metodo retirar().</li>
 * </ul>
 */
public class CuentaCorriente extends Cuenta {

    private double limiteDescubierto;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double limiteDescubierto) {
        super(numeroCuenta, saldoInicial);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void retirar(double monto) {

        double saldoDisponible = getSaldo() + limiteDescubierto;

        if (monto > saldoDisponible) {
            throw new FondosInsuficientesException(
                    "Supera el límite de descubierto."
            );
        }

        debitar(monto);
    }
}
