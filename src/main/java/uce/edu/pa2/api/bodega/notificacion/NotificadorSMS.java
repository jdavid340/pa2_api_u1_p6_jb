package uce.edu.pa2.api.bodega.notificacion;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorSMS implements INotificador {

    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el sms al destino: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
