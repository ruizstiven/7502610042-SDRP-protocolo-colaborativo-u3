package Taller14.Ejercicio3;

public class Tablet extends Dispositivo {
    @Override
    public void encender() {
        super.encender(); // Mala práctica: no agrega ni modifica comportamiento
    }
}
