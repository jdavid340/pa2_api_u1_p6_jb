package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Pedido;
import uce.edu.pa2.api.bodega.pago.PagoEfectivo;
import uce.edu.pa2.api.bodega.pago.PagoTarjetaCredito;
import uce.edu.pa2.api.bodega.service.PedidoService;

public class Main {
    public static void main(String[] args) throws Exception {
         Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication{
        
        /* Modelos IoC 
         1 D.I*/
        @Inject
        private PedidoService pedidoService;

        //2. Service Locator o Lookup
        //private PedidoService pedidoService=CDI.current().select(PedidoService.class).get();

        @Inject
        private PagoEfectivo pagoE;

        @Inject PagoTarjetaCredito pagoTc;

        @Override
        public int run(String... args){

            Pedido pedido1 = new Pedido("Josue Bailon", "PS5", 2500, "jb@gmail.com");
            this.pedidoService.registrar(pedido1,pagoE);

            Pedido pedido2 = new Pedido("Josue Bailon", "PS5", 100);
            this.pedidoService.registrar(pedido2, pagoTc);

            return 0;
        }
    }


}
