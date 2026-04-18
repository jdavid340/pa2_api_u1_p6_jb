package uce.edu.pa2.api.bodega.pago;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoTarjetaCredito implements IPagoEstrategia {

    @Override
    public void realizar(double valor) {
        System.out.println("-----Presenta pantalla donde pide los datos de la tarjeta-----");
        System.out.println("Realizando Cobro: " + valor);
    }

}
