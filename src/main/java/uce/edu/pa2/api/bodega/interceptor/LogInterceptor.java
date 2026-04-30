package uce.edu.pa2.api.bodega.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.pa2.api.bodega.anotaciones.Log;

@Log
@Interceptor
@Priority(1)
public class LogInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {
        System.out.println("Se ejecuto LOG antes del metodo");
        System.out.println("Interceptado el Método: "+context.getMethod().getName());
        Object[] args= context.getParameters();
        for (Object object : args) {
            System.out.println(object.toString());
        }
        Object resultado = context.proceed();
        System.out.println();
        return resultado;
    }
}
