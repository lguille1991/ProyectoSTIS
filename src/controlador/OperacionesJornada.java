package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesJornada {
    public String agregarJornada(Object obj);
    public String modificarJornada(Object obj);
    public String eliminarJornada(Object obj);
    public List mostrarJornada();
}
