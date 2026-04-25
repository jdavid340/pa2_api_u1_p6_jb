package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Venta;
import uce.edu.pa2.api.bodega.service.EstadisticasVentasGlobales;
import uce.edu.pa2.api.bodega.service.ProcesadorVentaEnLinea;
import uce.edu.pa2.api.bodega.service.ProcesadorVentaService;
import uce.edu.pa2.api.bodega.service.ProcesadorVentaService1;

public class Main {
    public static void main(String[] args) throws Exception {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private ProcesadorVentaEnLinea procesadorVentaEnLinea;
        
        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Josue Bailon", 550);
            Venta v2 = new Venta("Erick Pasmiño", 450);
            Venta v3 = new Venta("Miguel Soria", 100);
            Venta v4 = new Venta("Miguel Soria", 100);
            Venta v5 = new Venta("Miguel Soria", 100);

            this.procesadorVentaService.procesar(v1);
            this.procesadorVentaService.procesar(v2);
            this.procesadorVentaService.procesar(v3);
            this.procesadorVentaService1.procesar(v4);
            this.procesadorVentaEnLinea.procesar(v5);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;
        }
    }

}
