package uce.edu.pa2.api.bodega.descuento;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(4)
public class DescuentoISD implements IDescuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ISD");
        return valor * 0.90;
    }

}
