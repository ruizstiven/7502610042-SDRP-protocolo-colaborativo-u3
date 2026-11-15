package Taller17.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Agrega funcionalidad extra sin romper el contrato base
    public void aplicarInteres() {
        double interes = saldo * tasaInteres;
        depositar(interes);
    }
}