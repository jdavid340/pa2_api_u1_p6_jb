package uce.edu.pa2.api.bodega.notificacion;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
@Default
public class NotificadorMail implements INotificador {

    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el mail al destino: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
