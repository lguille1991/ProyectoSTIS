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
    public List llenarComboBoxPartido();
    public int llenarIdPartido(int idPartido);
    public int llenarIdEquipoL(int idEquipoLocal);
    public int llenarIdEquipoV(int idEquipoVisita);
}
