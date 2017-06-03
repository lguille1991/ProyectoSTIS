package modelo;
/**
 *
 * @author
 */
public class Gol {
    private int idGol;
    private int idTipoGol;
    private String nombreGol;
    private int idEquipo;
    private String nombreEquipo;
    private int idJugador;
    private String nombreJugador;
    private int minuto;

    public Gol() {
    }

    public Gol(int idGol, int idTipoGol, String nombreGol, int idEquipo, String nombreEquipo, int idJugador, String nombreJugador, int minuto) {
        this.idGol = idGol;
        this.idTipoGol = idTipoGol;
        this.nombreGol = nombreGol;
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.minuto = minuto;
    }

    public int getIdGol() {
        return idGol;
    }

    public void setIdGol(int idGol) {
        this.idGol = idGol;
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

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
