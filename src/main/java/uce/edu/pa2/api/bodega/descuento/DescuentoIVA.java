package uce.edu.pa2.api.bodega.descuento;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class DescuentoIVA implements IDescuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando IVA");
        return valor * 0.85;
    }

}
