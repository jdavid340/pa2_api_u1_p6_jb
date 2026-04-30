package uce.edu.pa2.api.bodega.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.pa2.api.bodega.anotaciones.MedirTiempo;

@MedirTiempo
@Interceptor
@Priority(2)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {
        System.out.println("Se ejecuto antes del metodo");
        System.out.println("Metodo Interceptado: "+ context.getMethod().getName());
        long inicio = System.currentTimeMillis();
        // Inicia la ejecucion del metodo
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido: " + (fin - inicio) + " ms");
        System.out.println();
        return resultado;
    }
}
