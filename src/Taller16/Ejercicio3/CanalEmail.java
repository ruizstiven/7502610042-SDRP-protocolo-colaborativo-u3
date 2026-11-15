package Taller16.Ejercicio3;

public class CanalEmail extends CanalEnvio {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
    }
}