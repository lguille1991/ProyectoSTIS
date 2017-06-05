package controlador;

import java.util.List;

/**
 *
 * @author Maria Jose
 */
public interface OperacionesTarjetaAmarilla {
    public String agregarTarjetaA(Object obj);
    public String modificarTarjetaA(Object obj);
    public String eliminarTarjetaA(Object obj);
    public List mostrarTarjetaA();
    public List llenarComboBoxEquipo();
    public List llenarComboBoxJugador(int idEquipo);
    public int llenarIdEquipo(String nombreEquipo);
    public int llenarIdJugador(String nombreJugador);
}
