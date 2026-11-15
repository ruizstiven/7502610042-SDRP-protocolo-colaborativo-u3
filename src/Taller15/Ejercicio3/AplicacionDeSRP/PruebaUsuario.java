package Taller15.Ejercicio3.AplicacionDeSRP;

public class PruebaUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("estudiante@unicartagena.edu.co", "clave123");

        ValidacionUsuarioService validador = new ValidacionUsuarioService();
        AutenticacionService authService = new AutenticacionService();

        if (validador.esValido(usuario)) {
            System.out.println("Formato de usuario válido.");

            boolean acceso = authService.iniciarSesion(usuario, "estudiante@unicartagena.edu.co", "clave123");
            System.out.println("¿Autenticación exitosa?: " + acceso);
        } else {
            System.out.println("Los datos del usuario no cumplen con los requisitos.");
        }
    }
}