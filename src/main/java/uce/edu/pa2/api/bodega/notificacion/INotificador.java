package uce.edu.pa2.api.bodega.notificacion;

public interface INotificador {
    void enviar(String destino, String mensaje);
}
