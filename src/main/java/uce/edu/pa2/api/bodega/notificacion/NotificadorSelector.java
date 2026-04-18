package uce.edu.pa2.api.bodega.notificacion;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail mail;

    @Inject
    private NotificadorSMS sms;

    @Inject
    private NotificadorWhatsapp whatsapp;

    public INotificador seleccionar(double total) {
        if (total < 20) {
            return whatsapp;
        } else if (total <= 120) {
            return mail;
        } else {
            return sms;
        }
    }
}
