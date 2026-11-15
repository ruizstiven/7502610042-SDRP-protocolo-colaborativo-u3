package Taller15.Ejercicio2.AplicacionDeSRP;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Teclado Mecánico", 100.00);

        CalculadoraPrecioService calculadora = new CalculadoraPrecioService();
        EtiquetaService etiquetaService = new EtiquetaService();

        double precioConIVA = calculadora.calcularPrecioFinal(producto, 0.19);
        etiquetaService.generarEtiqueta(producto, precioConIVA);
    }
}