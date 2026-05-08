package uce.edu.pa2.api.bodega.juego;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.pa2.api.bodega.modelo.Juego;

@ApplicationScoped
@Priority(3)
public class PlayStation implements IConsola{

    @Override
    public void iniciarJuego(Juego juego) {
        System.out.println("Iniciando juego: " + juego.getNombre() + " desde la PlayStation");
    }
}
