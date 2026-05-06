package uce.edu.pa2.api.bodega.impuestos;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoISD implements IImpuesto{
   
    @Override
    public double calcularImpuesto(double subTotal) {
        System.out.println("Impuesto ISD");
        return subTotal * 1.05;
    }

}
