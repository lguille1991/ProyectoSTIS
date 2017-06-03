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
    private int numeroEquipos;
    private int numeroJornadas;

    public Torneo() {
    }

    public Torneo(int idTorneo, String nombreTorneo, String fechaInicio, String fechaFinal, int numeroEquipos, int numeroJornadas) {
        this.idTorneo = idTorneo;
        this.nombreTorneo = nombreTorneo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.numeroEquipos = numeroEquipos;
        this.numeroJornadas = numeroJornadas;
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

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    public int getNumeroJornadas() {
        return numeroJornadas;
    }

    public void setNumeroJornadas(int numeroJornadas) {
        this.numeroJornadas = numeroJornadas;
    }

    @Override
    public String toString() {
        return "Torneo{" + "idTorneo=" + idTorneo + ", nombreTorneo=" + nombreTorneo + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", numeroEquipos=" + numeroEquipos + ", numeroJornadas=" + numeroJornadas + '}';
    }
 
}
