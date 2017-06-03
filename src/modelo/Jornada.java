package modelo;
/**
 *
 * @author 
 */
public class Jornada {
    private int idJornada;
    private String nombreJornada;
    private int idTorneo;
    private String nombreTorneo;

    public Jornada() {
    }

    public Jornada(int idJornada, String nombreJornada, int idTorneo, String nombreTorneo) {
        this.idJornada = idJornada;
        this.nombreJornada = nombreJornada;
        this.idTorneo = idTorneo;
        this.nombreTorneo = nombreTorneo;
    }

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    public String getNombreJornada() {
        return nombreJornada;
    }

    public void setNombreJornada(String nombreJornada) {
        this.nombreJornada = nombreJornada;
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

    @Override
    public String toString() {
        return "Jornada{" + "idJornada=" + idJornada + ", nombreJornada=" + nombreJornada + ", idTorneo=" + idTorneo + ", nombreTorneo=" + nombreTorneo + '}';
    }
   
}
