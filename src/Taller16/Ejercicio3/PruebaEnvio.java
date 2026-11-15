package Taller16.Ejercicio3;

public class PruebaEnvio {
    public static void main(String[] args) {
        Mensajero mensajero = new Mensajero();

        CanalEnvio email = new CanalEmail();
        CanalEnvio sms = new CanalSMS();
        CanalEnvio push = new CanalPush();

        mensajero.enviar(email, "usuario@correo.com", "Bienvenido al sistema.");
        mensajero.enviar(sms, "+57 300 123 4567", "Tu código de verificación es 4829.");
        mensajero.enviar(push, "User_ID_99", "Tienes una nueva actualización disponible.");
    }
}
