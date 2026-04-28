package uce.edu.pa2.api.bodega.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.anotaciones.MedirTiempo;
import uce.edu.pa2.api.bodega.modelo.Venta;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void procesar(Venta venta) {
        System.out.println("Procesando Pedido");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del Pedido");

    }

    @MedirTiempo
    public void reProcesar(Venta venta) {
        System.out.println("Reprocesando Pedido");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del reprocesando Pedido");

    }
}
