package uce.edu.pa2.api.bodega.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.anotaciones.MedirTiempo;
import uce.edu.pa2.api.bodega.modelo.Venta;

@ApplicationScoped
public class InventarioService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void registrarInventario(Venta venta) {
        System.out.println("Registro en el Inventario");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del registro del Inventario");

    }
}
