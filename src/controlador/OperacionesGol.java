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
    public List llenarComboBoxTipo();
    public List llenarComboBoxEquipo();
    public List llenarComboBoxJugador();
    public int llenarIdTipo(String nombreTipoGol);
    public int llenarIdEquipo(String nombreEquipo);
    public int llenarIdJugador(String nombreJugador);
    
}
