package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Venta;
import uce.edu.pa2.api.bodega.service.EstadisticasVentasGlobales;
import uce.edu.pa2.api.bodega.service.ProcesadorVentaService;

public class Main {
    public static void main(String[] args) throws Exception {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Josue Bailon", 550);
            Venta v2 = new Venta("Erick Pasmiño", 450);
            Venta v3 = new Venta("Miguel Soria", 100);
            
            this.procesadorVentaService.procesar(v1);
            this.procesadorVentaService.procesar(v2);
            this.procesadorVentaService.procesar(v3);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;
        }
    }

}
