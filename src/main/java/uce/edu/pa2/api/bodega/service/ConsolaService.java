package uce.edu.pa2.api.bodega.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.juego.IConsola;
import uce.edu.pa2.api.bodega.modelo.Juego;

@ApplicationScoped
public class ConsolaService {

    @Inject
    private Instance<IConsola> consolas;

    public void iniciar(Juego juego){
        for(IConsola con: consolas){
            con.iniciarJuego(juego);
        }
    }    

}
