package modelo;
/**
 *
 * @author
 */
public class TarjetaAmarilla {
    private int idTarjetaAmarilla;
    private int minuto;
    private int idJugador;
    private String nombreJugador;

    public TarjetaAmarilla() {
    }

    public TarjetaAmarilla(int idTarjetaAmarilla, int minuto, int idJugador, String nombreJugador) {
        this.idTarjetaAmarilla = idTarjetaAmarilla;
        this.minuto = minuto;
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
    }

    public int getIdTarjetaAmarilla() {
        return idTarjetaAmarilla;
    }

    public void setIdTarjetaAmarilla(int idTarjetaAmarilla) {
        this.idTarjetaAmarilla = idTarjetaAmarilla;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
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
        return "TarjetaAmarilla{" + "idTarjetaAmarilla=" + idTarjetaAmarilla + ", minuto=" + minuto + ", idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + '}';
    }
 
}
