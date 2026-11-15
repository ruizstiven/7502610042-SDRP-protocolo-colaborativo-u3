package Taller16.Ejercicio2;

public class DocumentoPDF extends Documento {
    public DocumentoPDF(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando a PDF: " + contenido);
    }
}
