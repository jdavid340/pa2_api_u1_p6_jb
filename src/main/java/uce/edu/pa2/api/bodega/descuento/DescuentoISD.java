package uce.edu.pa2.api.bodega.descuento;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoISD implements IDescuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ISD");
        return valor * 0.90;
    }

}
