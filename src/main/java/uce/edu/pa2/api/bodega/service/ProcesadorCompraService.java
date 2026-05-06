package uce.edu.pa2.api.bodega.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.descuento.IDescuento;
import uce.edu.pa2.api.bodega.impuestos.IImpuesto;
import uce.edu.pa2.api.bodega.modelo.Compra;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<IDescuento> descuentos;

    @Inject
    private Instance<IImpuesto> impuestos;

    public void procesar(Compra compra) {
        double total = compra.getSubTotal();
        for (IDescuento des : descuentos) {
           // total = des.aplicar(total);
        }

        for (IImpuesto imp : impuestos) {
            total = imp.calcularImpuesto(total);
        }
        compra.setTotal(total);

        System.out.println("Su valor a pagar es: " + compra.getTotal());
    }
}
