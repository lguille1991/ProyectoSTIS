package modelo;
/**
 *
 * @author 
 */
public class Empleado {
    private int idEmpleado;
    private String nombreEmpleado;
    private String cargo;
    private int idUsuario;
    private String contrasena;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombreEmpleado, String cargo, int idUsuario, String contrasena) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.cargo = cargo;
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", cargo=" + cargo + ", idUsuario=" + idUsuario + ", contrasena=" + contrasena + '}';
    }
      
}
