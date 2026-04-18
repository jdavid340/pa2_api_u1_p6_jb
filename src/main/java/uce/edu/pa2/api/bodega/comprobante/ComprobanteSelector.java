package uce.edu.pa2.api.bodega.comprobante;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Pedido;

@ApplicationScoped
public class ComprobanteSelector {

    @Inject
    private ComprobanteDigital comprobanteDi;

    @Inject
    private ComprobanteFisico comprobanteFi;

    public IComprobante seleccionar(Pedido pedido){
        if(pedido.getDestino().isEmpty() || pedido.getDestino()==null){
            return comprobanteFi;
        }

        return comprobanteDi;
    }

}
