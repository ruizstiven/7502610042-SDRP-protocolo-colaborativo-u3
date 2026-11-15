package Taller15.Ejercicio2.SituacionInicial;

public class PruebaInicialProducto {
    public static void main(String[] args) {
        // El mismo producto calcula su impuesto y genera su propia etiqueta
        ProductoMalDiseno producto = new ProductoMalDiseno("Teclado Mecánico", 100.00);

        System.out.println("Precio calculado: $" + producto.calcularPrecioConIVA());
        producto.generarEtiqueta();
    }
}
