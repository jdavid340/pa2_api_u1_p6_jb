package uce.edu.pa2.api.bodega.modelo;

public class Compra {

    private String cliente;
    private double subTotal;
    private double total;

    public Compra(){
        
    }

    public Compra(String cliente, double subTotal) {
        this.cliente = cliente;
        this.subTotal = subTotal;
    }

    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Compra [cliente=" + cliente + ", subtotal=" + subTotal + "]";
    }

}
