package Taller16.Ejercicio3;

public class Mensajero {
    public void enviar(CanalEnvio canal, String destinatario, String mensaje) {
        canal.enviarMensaje(destinatario, mensaje);
    }
}
