package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesHorario {
    public String agregarHorario(Object obj);
    public String modificarHorario(Object obj);
    public String eliminarHorario(Object obj);
    public List mostrarHorario();
}
