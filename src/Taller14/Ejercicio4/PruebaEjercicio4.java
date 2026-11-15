package Taller14.Ejercicio4;

public class PruebaEjercicio4 {
    public static void main(String[] args) {
        Vehiculo miVehiculo;

        miVehiculo = new Coche();
        miVehiculo.mover(); // Muestra el mensaje del coche

        miVehiculo = new Bicicleta();
        miVehiculo.mover(); // Muestra el mensaje de la bicicleta
    }
}