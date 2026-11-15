package Taller15.Ejercicio1.SituacionInicial;

public class LibroMalDiseno {
    private String titulo;
    private String autor;

    public LibroMalDiseno(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void generarReporte() {
        System.out.println("Reporte del Libro: " + titulo + " - Autor: " + autor);
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando el libro '" + titulo + "' en la base de datos...");
    }
}