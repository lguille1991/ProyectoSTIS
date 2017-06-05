package modelo;
/**
 *
 * @author
 */
public class TarjetaAmarilla {
    private int idTarjetaAmarilla;
    private int minuto;  
    private int idEquipo;
    private String nombreEquipo;
    private int idJugador;
    private String nombreJugador;

    public TarjetaAmarilla() {
    }

    public TarjetaAmarilla(int idTarjetaAmarilla, int minuto, int idEquipo, String nombreEquipo, int idJugador, String nombreJugador) {
        this.idTarjetaAmarilla = idTarjetaAmarilla;
        this.minuto = minuto;
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
    }


    public TarjetaAmarilla(int aInt, int aInt0, String string, int aInt1, String string0, int aInt2, String string1, int aInt3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "TarjetaAmarilla{" + "idTarjetaAmarilla=" + idTarjetaAmarilla + ", minuto=" + minuto + ", idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + '}';
    }
 
}
