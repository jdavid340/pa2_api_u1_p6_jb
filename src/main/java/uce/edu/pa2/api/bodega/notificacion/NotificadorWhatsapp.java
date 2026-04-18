package uce.edu.pa2.api.bodega.notificacion;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorWhatsapp implements INotificador{
    public void enviar(String numero, String mensaje) {
        System.out.println("Se envia el whatsapp al numero: " + numero);
        System.out.println("Con el mensaje: " + mensaje);
    }
}
