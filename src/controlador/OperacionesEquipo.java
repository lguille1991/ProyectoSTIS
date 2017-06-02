package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesEquipo {
    public String agregarEquipo(Object obj);
    public String modificarEquipo(Object obj);
    public String eliminarEquipo(Object obj);
    public List mostrarEquipo();
}
