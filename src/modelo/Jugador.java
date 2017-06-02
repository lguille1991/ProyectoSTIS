package modelo;
/**
 *
 * @author 
 */
public class Jugador {
    private String idJugador;
    private String nombreJugador;
    private String fechaNac;
    private int numeroDorsal;
    private String posicion;
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String idJugador, String nombreJugador, String fechaNac, int numeroDorsal, String posicion, Equipo equipo) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.fechaNac = fechaNac;
        this.numeroDorsal = numeroDorsal;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + ", fechaNac=" + fechaNac + ", numeroDorsal=" + numeroDorsal + ", posicion=" + posicion + ", equipo=" + equipo + '}';
    }
}
