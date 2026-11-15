package Taller16.Ejercicio2;

public class PruebaDocumento {
    public static void main(String[] args) {
        String texto = "Reporte Financiero 2026";

        Documento docPdf = new DocumentoPDF(texto);
        Documento docWord = new DocumentoWord(texto);
        Documento docExcel = new DocumentoExcel(texto);

        docPdf.exportar();
        docWord.exportar();
        docExcel.exportar();
    }
}
