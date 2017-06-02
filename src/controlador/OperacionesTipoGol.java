package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesTipoGol {
    public String agregarTipoGol(Object obj);
    public String modificarTipoGol(Object obj);
    public String eliminarTipoGol(Object obj);
    public List mostrarTipoGol();
}
