package modelo;
/**
 *
 * @author 
 */
public class TarjetaRoja {
    private int idTarjetaRoja;
    private int minuto;
    private int idJugador;
    private String nombreJugador;

    public TarjetaRoja() {
    }

    public TarjetaRoja(int idTarjetaRoja, int minuto, int idJugador, String nombreJugador) {
        this.idTarjetaRoja = idTarjetaRoja;
        this.minuto = minuto;
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
    }

    public int getIdTarjetaRoja() {
        return idTarjetaRoja;
    }

    public void setIdTarjetaRoja(int idTarjetaRoja) {
        this.idTarjetaRoja = idTarjetaRoja;
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
        return "TarjetaRoja{" + "idTarjetaRoja=" + idTarjetaRoja + ", minuto=" + minuto + ", idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + '}';
    }
    
}
