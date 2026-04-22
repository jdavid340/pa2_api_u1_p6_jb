package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {

    public static void main(String[] args) throws Exception {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private UsuarioService user;

        @Override
        public int run(String... args) {

            System.out.println("---- Primera llamada ----");
            user.registrarUsuario("alfonso", "clave123");

            System.out.println("---- Segunda llamada ----");
            user.registrarUsuario("rodolfo", "claveABC");
            return 0;
        }
    }

}
