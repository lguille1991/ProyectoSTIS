package modelo;
/**
 *
 * @author 
 */
public class Usuario {
    private String idUsuario;
    private String contrasena;
    private RolUsuario rol;

    public Usuario() {
    }

    public Usuario(String idUsuario, String contrasena, RolUsuario rol) {
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", contrasena=" + contrasena + ", rol=" + rol + '}';
    }

}
