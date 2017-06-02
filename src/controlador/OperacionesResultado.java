package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesResultado {
    public String agregarResultado(Object obj);
    public String modificarResultado(Object obj);
    public String eliminarResultado(Object obj);
    public List mostrarResultado();
}
