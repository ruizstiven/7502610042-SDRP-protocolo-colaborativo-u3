package Taller15.Ejercicio3.SituacionInicial;

public class UsuarioMalDiseno {
    private String correo;
    private String contrasena;

    public UsuarioMalDiseno(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public boolean validarFormato() {
        return correo.contains("@") && contrasena.length() >= 6;
    }

    public boolean autenticar(String correoIngresado, String passIngresada) {
        return this.correo.equals(correoIngresado) && this.contrasena.equals(passIngresada);
    }
}