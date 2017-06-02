package modelo;
/**
 *
 * @author 
 */
public class RolUsuario {
    private String idRol;
    private String idNombre;

    public RolUsuario() {
    }

    public RolUsuario(String idRol, String idNombre) {
        this.idRol = idRol;
        this.idNombre = idNombre;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getIdNombre() {
        return idNombre;
    }

    public void setIdNombre(String idNombre) {
        this.idNombre = idNombre;
    }

    @Override
    public String toString() {
        return "Rol_Usuario{" + "idRol=" + idRol + ", idNombre=" + idNombre + '}';
    }
   
}
