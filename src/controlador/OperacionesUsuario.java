package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesUsuario {
    public String agregarUsuario(Object obj);
    public String modificarUsuario(Object obj);
    public String eliminarUsuario(Object obj);
    public List mostrarUsuario();
}
