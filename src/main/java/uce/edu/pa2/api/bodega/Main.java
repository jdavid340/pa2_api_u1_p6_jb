package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Venta;
import uce.edu.pa2.api.bodega.service.ProcesadorVentaServiceTiempo;

public class Main {
    public static void main(String[] args) throws Exception {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;

        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Josue Bailon", 550);
            Venta v2 = new Venta("Erick Pasmiño", 450);
         
            this.procesadorVentaServiceTiempo.procesar(v1);
        //    this.procesadorVentaServiceTiempo.reProcesar(v2);

            return 0;
        }
    }

}
