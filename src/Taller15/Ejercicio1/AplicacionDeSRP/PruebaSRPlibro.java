package Taller15.Ejercicio1.AplicacionDeSRP;

public class PruebaSRPlibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez");

        LibroReporteService reporteService = new LibroReporteService();
        LibroRepository libroRepo = new LibroRepository();

        reporteService.generarReporte(libro);
        libroRepo.guardar(libro);
    }
}