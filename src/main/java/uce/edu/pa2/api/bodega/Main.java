package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.ambitos.AmbitoAplicacion;
import uce.edu.pa2.api.bodega.ambitos.AmbitoInject;
import uce.edu.pa2.api.bodega.ambitos.AmbitoRequest;
import uce.edu.pa2.api.bodega.ambitos.AmbitoSingleton;
import uce.edu.pa2.api.bodega.ambitos.ClaseIntermedia;

public class Main {
    public static void main(String[] args) throws Exception {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private AmbitoAplicacion ambitoAplicacion;

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Inject
        private AmbitoRequest ambitoRequest;

        @Inject
        private AmbitoInject ambitoInject;

        @Inject
        private AmbitoSingleton ambitoSingleton;

        @Override
        public int run(String... args) {
            
            System.out.println("----------Ambito Application----------");

            this.ambitoAplicacion.incrementar();
            this.ambitoAplicacion.incrementar();
            this.ambitoAplicacion.incrementar();
            int valor = this.ambitoAplicacion.incrementar();

            System.out.println(valor);

            this.claseIntermedia.imprimirObjetoValor();
            System.out.println(ambitoAplicacion);
            
            /* 
            System.out.println("-----------Ambito Request------------");
            System.out.println(this.ambitoRequest.incrementar());
            */

            System.out.println("----------Ambito Dependent----------");
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());

            this.claseIntermedia.imprimirObjetoValor();

            System.out.println("------Ambito Singleton-------");
            System.out.println(ambitoSingleton.incrementar());
            System.out.println(ambitoSingleton.incrementar());
            System.out.println(ambitoSingleton.incrementar());
            
            this.claseIntermedia.imprimirObjetoValorSingleton();

            return 0;
        }
    }

}
