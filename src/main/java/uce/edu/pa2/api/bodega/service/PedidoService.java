package uce.edu.pa2.api.bodega.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.comprobante.ComprobanteSelector;
import uce.edu.pa2.api.bodega.comprobante.IComprobante;
import uce.edu.pa2.api.bodega.modelo.Pedido;
import uce.edu.pa2.api.bodega.notificacion.INotificador;
import uce.edu.pa2.api.bodega.notificacion.NotificadorSelector;
import uce.edu.pa2.api.bodega.pago.IPagoEstrategia;

@ApplicationScoped
public class PedidoService {

    // @Inject
    // private NotificadorMail notificadorMail;

    /*
     * @Inject
     * public PedidoService(NotificadorMail notificadorMail) {
     * this.notificadorMail = notificadorMail;
     * }
     * 
     * 
     * @Inject
     * public void setNotificadorMail(NotificadorMail notificadorMail) {
     * this.notificadorMail = notificadorMail;
     * }
     */

    @Inject
    private NotificadorSelector selector;

    @Inject
    private ComprobanteSelector comprobanteSelec;

    public void registrar(Pedido pedido, IPagoEstrategia pago) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total del pedido: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        pago.realizar(pedido.getTotal());
        System.out.println();
        IComprobante comprobante = this.comprobanteSelec.seleccionar(pedido);
        comprobante.generar(pedido);
        System.out.println();

        INotificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Pedido Registrado");
        System.out.println();

    }
}
