package com.concepts.OOP.Beginning;
/**
 * <h6>Clase abstracta que implementa parcialmente la interfaz.</h6>
 * <ul>
 * <h6>🔹 ABSTRACCIÓN:</h6>
 * <li> No puede instanciarse.</li>
 * <h6>🔹 ENCAPSULAMIENTO:</h6>
 * <li> Atributos privados.</li>
 * <li> Modificación controlada.</li>
 * </ul>
 */
public abstract class Cuenta implements OperacionBancaria {

    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    /**
     * Implementación común a todas las cuentas.
     */
    @Override
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        }
        saldo += monto;
    }

    /**
     * Metodo abstracto → obliga a las subclases
     * a definir su lógica de retiro.
     */
    @Override
    public abstract void retirar(double monto);

    /**
     * Metodo protegido para modificar saldo
     * sin romper encapsulamiento.
     */
    protected void debitar(double monto) {
        saldo -= monto;
    }
}
