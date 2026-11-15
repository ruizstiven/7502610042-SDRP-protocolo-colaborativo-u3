package Taller15.Ejercicio3.SituacionInicial;

public class PruebaInicialUsuario {
    public static void main(String[] args) {
        // El usuario se valida a sí mismo y gestiona su propio inicio de sesión
        UsuarioMalDiseno usuario = new UsuarioMalDiseno("estudiante@unicartagena.edu.co", "clave123");

        if (usuario.validarFormato()) {
            System.out.println("Formato válido.");
            boolean acceso = usuario.autenticar("estudiante@unicartagena.edu.co", "clave123");
            System.out.println("¿Autenticación exitosa?: " + acceso);
        } else {
            System.out.println("Datos inválidos.");
        }
    }
}
