package uce.edu.pa2.api.bodega.comprobante;

import uce.edu.pa2.api.bodega.modelo.Pedido;

public interface IComprobante {
    public void generar(Pedido pedido);
}
