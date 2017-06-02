package modelo;
/**
 *
 * @author 
 */
public class Estadio {
    private String idEstadio;
    private String nombreEstadio;

    public Estadio() {
    }

    public Estadio(String idEstadio, String nombreEstadio) {
        this.idEstadio = idEstadio;
        this.nombreEstadio = nombreEstadio;
    }

    public String getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(String idEstadio) {
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
