package uce.edu.pa2.api.bodega.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadisticasVentasGlobales {
    private int totalVentas=0;
    private double montoTotalVendido;

    public void registrarVenta(double totalVentaIndividual){
        this.totalVentas++;
        this.montoTotalVendido+=totalVentaIndividual;
    }

    public void mostrarEstadisticasGlobales(){
        System.out.println("ESTADISTICAS GLOBALES");
        System.out.println("Cantidad Ventas: " +this.totalVentas);
        System.out.println("Valor Total Vendido: " +this.montoTotalVendido);
    }
}
