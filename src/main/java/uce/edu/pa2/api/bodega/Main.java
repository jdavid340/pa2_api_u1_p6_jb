package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

public class Main {
    public static void main(String[] args) throws Exception {
         Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication{
        
        /* Modelos IoC 
         1 D.I
        @Inject
        private PedidoService pedidoService;
        */
        @Inject
        private PedidoService pedidoService2;

        //2. Service Locator o Lookup
        //private PedidoService pedidoService=CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args){
            PedidoService pedidoService=CDI.current().select(PedidoService.class).get();

            Pedido pedido1 = new Pedido("Josue Bailon", "PS5", 2500, "jb@gmail.com");
            pedidoService.registrar(pedido1);

            Pedido pedido2 = new Pedido("Josue Bailon", "PS5", 100, "jb@gmail.com");
            pedidoService.registrar(pedido2);

            Pedido pedido3 = new Pedido("Josue Bailon", "PS5", 1, "jb@gmail.com");
            pedidoService.registrar(pedido3);
            return 0;
        }
    }


}
