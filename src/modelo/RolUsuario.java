package modelo;
/**
 *
 * @author 
 */
public class RolUsuario {
    private int idRol;
    private String idNombre;

    public RolUsuario() {
    }

    public RolUsuario(int idRol, String idNombre) {
        this.idRol = idRol;
        this.idNombre = idNombre;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
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
