package Taller15.Ejercicio3.AplicacionDeSRP;

public class Usuario {
    private String correo;
    private String contrasena;

    public Usuario(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() { return correo; }
    public String getContrasena() { return contrasena; }
}

// 2. Clase encargada únicamente de validar reglas de negocio/formato
class ValidacionUsuarioService {
    public boolean esValido(Usuario usuario) {
        boolean correoValido = usuario.getCorreo() != null && usuario.getCorreo().contains("@");
        boolean passValida = usuario.getContrasena() != null && usuario.getContrasena().length() >= 6;
        return correoValido && passValida;
    }
}

// 3. Clase encargada únicamente de verificar credenciales
class AutenticacionService {
    public boolean iniciarSesion(Usuario usuario, String correoIngresado, String passIngresada) {
        return usuario.getCorreo().equals(correoIngresado) &&
                usuario.getContrasena().equals(passIngresada);
    }
}