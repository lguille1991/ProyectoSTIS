package controlador;

import java.util.List;

/**
 *
 * @author Maria Jose
 */
public interface OperacionesTarjetaRoja {
    public String agregarTarjetaR(Object obj);
    public String modificarTarjetaR(Object obj);
    public String eliminarTarjetaR(Object obj);
    public List mostrarTarjetaR();
    public List llenarComboBoxEquipo();
    public List llenarComboBoxJugador(int idEquipo);
    public int llenarIdEquipo(String nombreEquipo);
    public int llenarIdJugador(String nombreJugador);
}
