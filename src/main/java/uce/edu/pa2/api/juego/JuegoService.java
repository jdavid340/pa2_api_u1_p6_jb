package uce.edu.pa2.api.juego;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class JuegoService {

    @Inject
    private RegistroJuego registro;



    public void registrarAccion(Jugador jugador, String accion){
        System.out.println("Registrando Accion");
        System.out.println("El jugador: "+jugador.getNombre()+ " " +jugador.getApellido());
        System.out.println("Puntaje actual: "+jugador.getPuntaje());
        registro.registrarAccion(jugador, accion);

        System.out.println("Obtuvo bonificacion de 5 puntos por hacer una acción");
        jugador.setPuntaje(jugador.getPuntaje() + 5); 
        System.out.println("Puntaje Final: " + jugador.getPuntaje()); 
    }
}
