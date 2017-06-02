package modelo;
/**
 *
 * @author
 */
public class Gol {
    private String idGol;
    private String minuto;
    private TipoGol tipoGol;
    private Jugador jugador;

    public Gol() {
    }

    public Gol(String idGol, String minuto, TipoGol tipoGol, Jugador jugador) {
        this.idGol = idGol;
        this.minuto = minuto;
        this.tipoGol = tipoGol;
        this.jugador = jugador;
    }

    public String getIdGol() {
        return idGol;
    }

    public void setIdGol(String idGol) {
        this.idGol = idGol;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public TipoGol getTipoGol() {
        return tipoGol;
    }

    public void setTipoGol(TipoGol tipoGol) {
        this.tipoGol = tipoGol;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Gol{" + "idGol=" + idGol + ", minuto=" + minuto + ", tipoGol=" + tipoGol + ", jugador=" + jugador + '}';
    }
}
