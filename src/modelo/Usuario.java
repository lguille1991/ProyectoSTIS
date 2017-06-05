package modelo;
/**
 *
 * @author 
 */
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private int idRol;
    private String idNombre;
    private int idEmpleado;
    private String nombreEmpleado;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String contrasena, int idRol, String idNombre, int idEmpleado, String nombreEmpleado) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.idRol = idRol;
        this.idNombre = idNombre;
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }


}
