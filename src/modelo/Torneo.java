package modelo;
/**
 *
 * @author 
 */
public class Torneo {
    private int idTorneo;
    private String nombreTorneo;
    private String fechaInicio;
    private String fechaFinal;
    private int idUsuario;
    private String nombreUsuario;

    public Torneo() {
    }

    public Torneo(int idTorneo, String nombreTorneo, String fechaInicio, String fechaFinal, int idUsuario, String nombreUsuario) {
        this.idTorneo = idTorneo;
        this.nombreTorneo = nombreTorneo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
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
    
}
