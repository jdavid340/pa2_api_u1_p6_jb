package uce.edu.pa2.api.bodega.impuestos;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIVA implements IImpuesto {

    @Override
    public double calcularImpuesto(double subTotal) {
        System.out.println("Impuesto IVA");
        return subTotal * 1.15;
    }

}
