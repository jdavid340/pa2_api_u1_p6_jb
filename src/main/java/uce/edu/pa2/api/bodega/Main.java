package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.modelo.Juego;
import uce.edu.pa2.api.bodega.service.ConsolaService;

public class Main {

    public static void main(String[] args) throws Exception {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ConsolaService consolaService;

        @Override
        public int run(String... args) {
            Juego j1=new Juego("Minecraft", "Supervivencia", 30);
            this.consolaService.iniciar(j1);
            return 0;
        }
    }

}
