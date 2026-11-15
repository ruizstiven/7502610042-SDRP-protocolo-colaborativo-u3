package Taller15.Ejercicio1.AplicacionDeSRP;

class LibroRepository {
    public void guardar(Libro libro) {
        System.out.println("Base de Datos -> Guardando libro: " + libro.getTitulo());
    }
}