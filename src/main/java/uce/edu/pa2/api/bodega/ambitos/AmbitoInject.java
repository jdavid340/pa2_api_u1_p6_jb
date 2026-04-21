package uce.edu.pa2.api.bodega.ambitos;

import jakarta.enterprise.context.Dependent;

@Dependent
public class AmbitoInject {


    private int contador = 0;

    public int incrementar() {
        return contador++;
    }

}

