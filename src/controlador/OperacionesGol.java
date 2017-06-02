package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesGol {
    public String agregarGol(Object obj);
    public String modificarGol(Object obj);
    public String eliminarGol(Object obj);
    public List mostrarGol();
}
