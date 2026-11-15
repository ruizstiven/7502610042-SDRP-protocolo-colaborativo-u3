package Taller15.Ejercicio2.SituacionInicial;

public class ProductoMalDiseno {
    private String nombre;
    private double precioBase;

    public ProductoMalDiseno(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double calcularPrecioConIVA() {
        return precioBase * 1.19;
    }

    public void generarEtiqueta() {
        System.out.println("ETIQUETA: " + nombre + " - $" + calcularPrecioConIVA());
    }
}