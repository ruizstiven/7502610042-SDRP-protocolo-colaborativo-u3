package Taller16.Ejercicio1;

public class CalculadoraPrecio {
    public double calcularTotal(Descuento descuento, double precio) {
        return descuento.aplicarDescuento(precio);
    }
}