package modelo;

/**
 *
 * @author 
 */
public class Defensa extends Jugador{
    private String tipo;

    public Defensa(String tipo) {
        this.tipo = tipo;
    }

    public Defensa(String tipo, int idJugador, String nombreJugador, String fechaNac, int numeroDorsal, String posicion, int idEquipo, String nombreEquipo) {
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
        return "Defensa{" + "tipo=" + tipo + '}';
    }
}
