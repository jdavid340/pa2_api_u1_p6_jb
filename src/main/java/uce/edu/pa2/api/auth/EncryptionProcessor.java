package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
class EncryptionProcessor {

    public void process(String data) {
        System.out.println("Procesando dato específico: " + data);
    }
}

