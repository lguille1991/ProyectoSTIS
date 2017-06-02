package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesEmpleado {
    public String agregarEmpleado(Object obj);
    public String modificarEmpleado(Object obj);
    public String eliminarEmpleado(Object obj);
    public List mostrarEmpleado();
}
