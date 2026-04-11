package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {
    public static void main(String[] args) throws Exception {
         Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication{
        
        @Inject
        private PedidoService pedidoService;

        @Override
        public int run(String... args){
            Pedido p1 = new Pedido("Josue Bailon", "PS5", 2500, "jb@gmail.com");

            this.pedidoService.registrar(p1);
            return 0;
        }
    }


}
