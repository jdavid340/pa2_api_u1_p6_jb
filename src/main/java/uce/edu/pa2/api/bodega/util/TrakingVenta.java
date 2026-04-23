package uce.edu.pa2.api.bodega.util;

import jakarta.enterprise.context.Dependent;

@Dependent
public class TrakingVenta {
    private long tiempoInicio=0;
    private long tiempoFinal=0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public void finalizar() {
        this.tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - this.tiempoInicio;
        System.out.println("Tiempo Ejecucion: " + tiempoEjecucion);
    }

}
