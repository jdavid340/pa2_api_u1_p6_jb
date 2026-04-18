package uce.edu.pa2.api.bodega.comprobante;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.pa2.api.bodega.modelo.Pedido;

@ApplicationScoped
public class ComprobanteFisico implements IComprobante{

    @Override
    public void generar(Pedido pedido) {
        System.out.println("---Generando Comprobante Fisico---");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        

    }

}
