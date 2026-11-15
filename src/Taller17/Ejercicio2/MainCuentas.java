package Taller17.Ejercicio2;

public class MainCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000.0);
        CuentaBancaria cuenta2 = new CuentaAhorros(1000.0, 0.05);

        // Ambas responden igual a los métodos de la clase base
        cuenta1.depositar(200.0);
        cuenta1.retirar(150.0);

        cuenta2.depositar(200.0);
        cuenta2.retirar(150.0);
    }
}