package uce.edu.pa2.api.bodega.impuestos;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements IImpuesto{
   
    @Override
    public double calcularImpuesto(double subTotal) {
        System.out.println("Impuesto ICE");
        return subTotal * 1.25;
    }

}
