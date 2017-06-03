package modelo;

/**
 *
 * @author 
 */
public class Delantero extends Jugador {
    private String tipo;

    public Delantero(String tipo) {
        this.tipo = tipo;
    }

    public Delantero(String tipo, int idJugador, String nombreJugador, String fechaNac, int numeroDorsal, String posicion, int idEquipo, String nombreEquipo) {
        super(idJugador, nombreJugador, fechaNac, numeroDorsal, posicion, idEquipo, nombreEquipo);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Delantero{" + "tipo=" + tipo + '}';
    }
     
}
