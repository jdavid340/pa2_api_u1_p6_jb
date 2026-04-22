package uce.edu.pa2.api.bodega;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class EncryptionUtility {
    private String secretKey = "secreto_pa2";

    @Inject
    private EncryptionProcessor processor;

    @Inject
    private LoggerUtil logger; 

    public String encriptar(String clave) {
        System.out.println("Usando clave secreta única.");
        processor.process(clave); 
        logger.log("Se encriptó la clave: " + clave); 
        return "Encrypted: (" + clave +secretKey+ ")";
    }
}
