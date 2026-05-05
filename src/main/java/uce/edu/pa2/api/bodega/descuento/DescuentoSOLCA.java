package uce.edu.pa2.api.bodega.descuento;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSOLCA implements IDescuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando SOLCA");
        return valor * 0.80;
    }
}
