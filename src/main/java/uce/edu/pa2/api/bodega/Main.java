package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Compra;
import uce.edu.pa2.api.bodega.service.ProcesadorCompraService;

public class Main {
    public static void main(String[] args) throws Exception {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorCompraService procesadorCompraService;

        @Override
        public int run(String... args) {
            Compra compra=new Compra("Josue Bailon", 100);
            this.procesadorCompraService.procesar(compra);
            return 0;
        }
    }

}
