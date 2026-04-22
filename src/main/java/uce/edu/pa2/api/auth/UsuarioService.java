package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UsuarioService {

    @Inject
    private EncryptionUtility encryptionUtility;

    @Inject
    private LoggerUtil logger;

    public void registrarUsuario(String username, String clave) {

        if (clave == null || clave.length() < 6) {
            throw new IllegalArgumentException("La clave debe tener al menos 6 caracteres");
        }

        String claveEncriptada = encryptionUtility.encriptar(clave);

        System.out.println("Usuario: " + username);
        System.out.println("Clave guardada: " + claveEncriptada);

        logger.log("Usuario registrado: " + username);
    }
}
