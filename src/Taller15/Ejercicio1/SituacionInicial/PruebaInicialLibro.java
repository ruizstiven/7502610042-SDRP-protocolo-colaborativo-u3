package Taller15.Ejercicio1.SituacionInicial;

public class PruebaInicialLibro {
    public static void main(String[] args) {
        // Un solo objeto asume todas las responsabilidades
        LibroMalDiseno libro = new LibroMalDiseno("Cien años de soledad", "Gabriel García Márquez");

        libro.generarReporte();
        libro.guardarEnBaseDeDatos();
    }
}
