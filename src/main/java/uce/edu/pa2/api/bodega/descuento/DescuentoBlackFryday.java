package uce.edu.pa2.api.bodega.descuento;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoBlackFryday implements IDescuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Black Fryday");
        return valor * 0.50;
    }
}
