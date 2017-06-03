package modelo;
/**
 *
 * @author 
 */
public class Usuario {
    private int idUsuario;
    private String contrasena;
    private int idRol;
    private String idNombre;
    private int idEmpleado;
    private String nombreEmpleado;

    public Usuario() {
    }

    public Usuario(int idUsuario, String contrasena, int idRol, String idNombre, int idEmpleado, String nombreEmpleado) {
        this.idUsuario = idUsuario;
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

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", contrasena=" + contrasena + ", idRol=" + idRol + ", idNombre=" + idNombre + ", idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + '}';
    }

}
