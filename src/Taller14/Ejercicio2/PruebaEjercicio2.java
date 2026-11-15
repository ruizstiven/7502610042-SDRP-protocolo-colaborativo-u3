package Taller14.Ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();    // Ejecuta el método de Persona
        estudiante.presentarse(); // Ejecuta el método sobrescrito en Estudiante
        profesor.presentarse();   // Ejecuta el método sobrescrito en Profesor
    }
}