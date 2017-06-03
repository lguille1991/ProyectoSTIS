package modelo;

/**
 *
 * @author 
 */
public class Volante extends Jugador {
    private String tipo;

    public Volante(String tipo) {
        this.tipo = tipo;
    }

    public Volante(String tipo, int idJugador, String nombreJugador, String fechaNac, int numeroDorsal, String posicion, int idEquipo, String nombreEquipo) {
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
        return "Volante{" + "tipo=" + tipo + '}';
    }
    
}
