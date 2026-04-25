package uce.edu.pa2.api.bodega.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Venta;
import uce.edu.pa2.api.bodega.util.TrakingVenta;

@ApplicationScoped
public class ProcesadorVentaService1 {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @Inject
    private TrakingVenta trakingVenta;

    public void procesar(Venta venta) {
        this.trakingVenta.iniciar();
        System.out.println();
        System.out.println("Procesando Pedido");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        this.trakingVenta.finalizar();

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

    }
}
