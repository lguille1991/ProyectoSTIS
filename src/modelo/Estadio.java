package modelo;
/**
 *
 * @author 
 */
public class Estadio {
    private int idEstadio;
    private String nombreEstadio;

    public Estadio() {
    }

    public Estadio(int idEstadio, String nombreEstadio) {
        this.idEstadio = idEstadio;
        this.nombreEstadio = nombreEstadio;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    @Override
    public String toString() {
        return "Estadio{" + "idEstadio=" + idEstadio + ", nombreEstadio=" + nombreEstadio + '}';
    }
    
   
}
