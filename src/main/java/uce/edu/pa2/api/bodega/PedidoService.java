package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    // @Inject
   // private NotificadorMail notificadorMail;

    /*
     * @Inject
     * public PedidoService(NotificadorMail notificadorMail) {
     * this.notificadorMail = notificadorMail;
     * }
     

    @Inject
    public void setNotificadorMail(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    } */


    @Inject
    private NotificadorSelector selector;

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total del pedido: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        Notificador notificador=this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Pedido Registrado");

    }    
}
