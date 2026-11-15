package Taller17.Ejercicio3;

public class MainTransporte {
    public static void iniciarViaje(Transporte transporte) {
        transporte.desplazarse();
    }

    public static void main(String[] args) {
        Transporte miBici = new Bicicleta();
        Transporte miCoche = new Coche();

        // Sustitución directa sin alterar el programa
        iniciarViaje(miBici);
        iniciarViaje(miCoche);
    }
}