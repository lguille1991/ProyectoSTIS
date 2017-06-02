package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesPartido {
    public String agregarPartido(Object obj);
    public String modificarPartido(Object obj);
    public String eliminarPartido(Object obj);
    public List mostrarPartido();
}
