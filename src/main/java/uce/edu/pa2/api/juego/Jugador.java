package uce.edu.pa2.api.juego;

public class Jugador {
    private String nombre;
    private String apellido;
    private String cedula;
    private  int puntaje;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String cedula, int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    
}
