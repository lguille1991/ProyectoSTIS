package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesJugador {
    public String agregarJugador(Object obj);
    public String modificarJugador(Object obj);
    public String eliminarJugador(Object obj);
    public List mostrarJugador();
}
