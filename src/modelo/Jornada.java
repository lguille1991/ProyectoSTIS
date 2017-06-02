package modelo;
/**
 *
 * @author 
 */
public class Jornada {
    private String idJornada;
    private String nombreJornada;
    private Torneo torneos;

    public Jornada() {
    }

    public Jornada(String idJornada, String nombreJornada, Torneo torneos) {
        this.idJornada = idJornada;
        this.nombreJornada = nombreJornada;
        this.torneos = torneos;
    }

    public String getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(String idJornada) {
        this.idJornada = idJornada;
    }

    public String getNombreJornada() {
        return nombreJornada;
    }

    public void setNombreJornada(String nombreJornada) {
        this.nombreJornada = nombreJornada;
    }

    public Torneo getTorneos() {
        return torneos;
    }

    public void setTorneos(Torneo torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return "Jornada{" + "idJornada=" + idJornada + ", nombreJornada=" + nombreJornada + ", torneos=" + torneos + '}';
    }
   
}
