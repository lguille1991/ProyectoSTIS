package modelo;
/**
 *
 * @author
 */
public class TarjetaAmarilla {
    private String idTarjetaAmarilla;
    private String minuto;
    private Jugador jugador;

    public TarjetaAmarilla() {
    }

    public TarjetaAmarilla(String idTarjetaAmarilla, String minuto, Jugador jugador) {
        this.idTarjetaAmarilla = idTarjetaAmarilla;
        this.minuto = minuto;
        this.jugador = jugador;
    }

    public String getIdTarjetaAmarilla() {
        return idTarjetaAmarilla;
    }

    public void setIdTarjetaAmarilla(String idTarjetaAmarilla) {
        this.idTarjetaAmarilla = idTarjetaAmarilla;
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
        return "TarjetaAmarilla{" + "idTarjetaAmarilla=" + idTarjetaAmarilla + ", minuto=" + minuto + ", jugador=" + jugador + '}';
    }
 
}
