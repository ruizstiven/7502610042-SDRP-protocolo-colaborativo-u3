package Taller14.Ejercicio3;

public class PruebaEjercicio3 {
    public static void main(String[] args) {
        // 1. Error de compilación al invocar un método exclusivo de la clase derivada
        Dispositivo miDispositivo = new Telefono();
        miDispositivo.encender(); // Válido

        // La siguiente línea genera error de compilación:
       /* "cannot find symbol: method hacerLlamada() in class Dispositivo"
        miDispositivo.hacerLlamada();

        */

        // 2. Uso innecesario de sobrescritura
        Dispositivo miTablet = new Tablet();
        miTablet.encender();
    }
}