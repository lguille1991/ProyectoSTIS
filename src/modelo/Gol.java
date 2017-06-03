package modelo;
/**
 *
 * @author
 */
public class Gol {
    private int idGol;
    private String minuto;
    private int idTipoGol;
    private String nombreGol;
    private int idJugador;
    private String nombreJugador;

    public Gol() {
    }

    public Gol(int idGol, String minuto, int idTipoGol, String nombreGol, int idJugador, String nombreJugador) {
        this.idGol = idGol;
        this.minuto = minuto;
        this.idTipoGol = idTipoGol;
        this.nombreGol = nombreGol;
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
    }

    public int getIdGol() {
        return idGol;
    }

    public void setIdGol(int idGol) {
        this.idGol = idGol;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public int getIdTipoGol() {
        return idTipoGol;
    }

    public void setIdTipoGol(int idTipoGol) {
        this.idTipoGol = idTipoGol;
    }

    public String getNombreGol() {
        return nombreGol;
    }

    public void setNombreGol(String nombreGol) {
        this.nombreGol = nombreGol;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String toString() {
        return "Gol{" + "idGol=" + idGol + ", minuto=" + minuto + ", idTipoGol=" + idTipoGol + ", nombreGol=" + nombreGol + ", idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + '}';
    }

}
