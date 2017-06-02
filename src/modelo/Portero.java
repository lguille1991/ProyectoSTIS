package modelo;

/**
 *
 * @author 
 */
public class Portero extends Jugador {
    private String tipo;

    public Portero(String tipo) {
        this.tipo = tipo;
    }

    public Portero(String tipo, String idJugador, String nombreJugador, String fechaNac, int numeroDorsal, String posicion, Equipo equipo) {
        super(idJugador, nombreJugador, fechaNac, numeroDorsal, posicion, equipo);
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
        return "Portero{" + "tipo=" + tipo + '}';
    }

    
    
    
}
