package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesArbitro {
    public String agregarArbitro(Object obj);
    public String modificarArbitro(Object obj);
    public String eliminarArbitro(Object obj);
    public List llenarComboBox();
    public List mostrarArbitro();
    public int llenarId(String nombreNacion);
}
