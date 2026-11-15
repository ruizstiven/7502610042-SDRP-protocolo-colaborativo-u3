package Taller15.Ejercicio1.AplicacionDeSRP;

class LibroReporteService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte -> Título: " + libro.getTitulo() + " | Autor: " + libro.getAutor());
    }
}
