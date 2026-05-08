package uce.edu.pa2.api.bodega.juego;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.pa2.api.bodega.modelo.Juego;

@ApplicationScoped
@Priority(1)
public class Xbox implements IConsola{

    @Override
    public void iniciarJuego(Juego juego) {
        System.out.println("Iniciando juego: " +juego.getNombre()+" desde la Xbox");
    }
    
}
