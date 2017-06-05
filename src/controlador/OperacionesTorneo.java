package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesTorneo {
    public String agregarTorneo(Object obj);
    public String modificarTorneo(Object obj);
    public String eliminarTorneo(Object obj);
    public List mostrarTorneo();
    public List llenarComboBoxUsuario();
    public int llenarIdUsuario(String nombreUsuario);
}
