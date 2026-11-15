package Taller16.Ejercicio3;

public class CanalPush extends CanalEnvio {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando Notificación Push al dispositivo de " + destinatario + ": " + mensaje);
    }
}