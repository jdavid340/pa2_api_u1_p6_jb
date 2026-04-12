package uce.edu.pa2.api.juego;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RegistroJuego {

    public void registrarAccion(Jugador jugador, String accion){
        System.out.println("Realizo la accion: "+accion);
    }

}
