package Taller16.Ejercicio3;

public class CanalSMS extends CanalEnvio {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando SMS al número " + destinatario + ": " + mensaje);
    }
}