package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LoggerUtil {
    public void log(String mensaje) {
        System.out.println("LOG: " + mensaje);
    }
}