package Taller14.Ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 6.0);

        figura1.calcularArea(); // Muestra el área del círculo
        figura2.calcularArea(); // Muestra el área del rectángulo
    }
}