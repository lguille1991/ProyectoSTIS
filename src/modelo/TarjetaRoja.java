package modelo;
/**
 *
 * @author 
 */
public class TarjetaRoja {
    private String idTarjetaRoja;
    private String minuto;
    private Jugador jugador;

    public TarjetaRoja() {
    }

    public TarjetaRoja(String idTarjetaRoja, String minuto, Jugador jugador) {
        this.idTarjetaRoja = idTarjetaRoja;
        this.minuto = minuto;
        this.jugador = jugador;
    }

    public String getIdTarjetaRoja() {
        return idTarjetaRoja;
    }

    public void setIdTarjetaRoja(String idTarjetaRoja) {
        this.idTarjetaRoja = idTarjetaRoja;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "TarjetaRoja{" + "idTarjetaRoja=" + idTarjetaRoja + ", minuto=" + minuto + ", jugador=" + jugador + '}';
    }

    
}
