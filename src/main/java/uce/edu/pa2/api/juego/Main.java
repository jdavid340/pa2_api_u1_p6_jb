package uce.edu.pa2.api.juego;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {
  public static void main(String[] args) throws Exception {
         Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication{
        
        @Inject
        private JuegoService juegoService;

        @Override
        public int run(String... args){
            Jugador p1 = new Jugador("Josue","Bailon", "1324564987", 5);

            this.juegoService.registrarAccion(p1, "moverse");
            return 0;
        }
    }   
}