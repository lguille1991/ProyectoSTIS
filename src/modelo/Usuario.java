package modelo;
/**
 *
 * @author 
 */
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private int idEmpleado;
    private String nombreEmpleado;    
    private String contrasena;
    private int idRol;
    private String nombreRol;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, int idEmpleado, String nombreEmpleado, String contrasena, int idRol, String nombreRol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.contrasena = contrasena;
        this.idRol = idRol;
        this.nombreRol = nombreRol;
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

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
 }
