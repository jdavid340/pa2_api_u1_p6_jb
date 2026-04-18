package uce.edu.pa2.api.bodega.pago;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoEfectivo implements IPagoEstrategia {

    @Override
    public void realizar(double valor) {
        System.out.println("-----Presenta una pantalla-----");
        System.out.println("Realizando Cobro:" + valor);
    }

}
