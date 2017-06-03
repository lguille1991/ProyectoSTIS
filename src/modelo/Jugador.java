package modelo;
/**
 *
 * @author 
 */
public class Jugador {
    private int idJugador;
    private String nombreJugador;
    private String fechaNac;
    private int numeroDorsal;
    private String posicion;
    private int idEquipo;
    private String nombreEquipo;

    public Jugador() {
    }

    public Jugador(int idJugador, String nombreJugador, String fechaNac, int numeroDorsal, String posicion, int idEquipo, String nombreEquipo) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.fechaNac = fechaNac;
        this.numeroDorsal = numeroDorsal;
        this.posicion = posicion;
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
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

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNumeroDorsal() {
        return numeroDorsal;
    }

    public void setNumeroDorsal(int numeroDorsal) {
        this.numeroDorsal = numeroDorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
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
        return "Jugador{" + "idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + ", fechaNac=" + fechaNac + ", numeroDorsal=" + numeroDorsal + ", posicion=" + posicion + ", idEquipo=" + idEquipo + ", nombreEquipo=" + nombreEquipo + '}';
    }
}
