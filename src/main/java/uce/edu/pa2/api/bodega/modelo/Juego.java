package uce.edu.pa2.api.bodega.modelo;

public class Juego {

    private String nombre;
    private String genero;
    private double precio;

    public Juego(String nombre, String genero, double precio) {
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

}   