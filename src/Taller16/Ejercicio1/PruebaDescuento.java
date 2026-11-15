package Taller16.Ejercicio1;

public class PruebaDescuento {
    public static void main(String[] args) {
        CalculadoraPrecio calculadora = new CalculadoraPrecio();
        double precioProducto = 200.0;

        Descuento descPorcentaje = new DescuentoPorcentaje(15); // 15% de descuento
        Descuento descFijo = new DescuentoFijo(35.0);           // $35 de descuento fijo

        System.out.println("Precio original: $" + precioProducto);
        System.out.println("Con 15% de descuento: $" + calculadora.calcularTotal(descPorcentaje, precioProducto));
        System.out.println("Con $35 de descuento fijo: $" + calculadora.calcularTotal(descFijo, precioProducto));
    }
}
