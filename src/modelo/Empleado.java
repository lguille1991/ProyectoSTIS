package modelo;
/**
 *
 * @author 
 */
public class Empleado {
    private String idEmpleado;
    private String nombreEmpleado;
    private String cargo;
    private Usuario usuario;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombreEmpleado, String cargo, Usuario usuario) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.cargo = cargo;
        this.usuario = usuario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", cargo=" + cargo + ", usuario=" + usuario + '}';
    }      
}
