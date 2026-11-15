package Taller15.Ejercicio2.AplicacionDeSRP;

public class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
}

// 2. Clase encargada únicamente de cálculos financieros
class CalculadoraPrecioService {
    public double calcularPrecioFinal(Producto producto, double porcentajeImpuesto) {
        return producto.getPrecioBase() * (1 + porcentajeImpuesto);
    }
}

// 3. Clase encargada únicamente de formatear e imprimir etiquetas
class EtiquetaService {
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("=== ETIQUETA DE PRODUCTO ===");
        System.out.println("Artículo: " + producto.getNombre());
        System.out.printf("Precio Total: $%.2f%n", precioFinal);
        System.out.println("============================");
    }
}
