package modelo;
/**
 *
 * @author
 */
public class Nacionalidad {
    private String idNacionalidad;
    private String nombreNacionalidad;

    public Nacionalidad() {
    }

    public Nacionalidad(String idNacionalidad, String nombreNacionalidad) {
        this.idNacionalidad = idNacionalidad;
        this.nombreNacionalidad = nombreNacionalidad;
    }

    public String getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(String idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNombreNacionalidad() {
        return nombreNacionalidad;
    }

    public void setNombreNacionalidad(String nombreNacionalidad) {
        this.nombreNacionalidad = nombreNacionalidad;
    }

    @Override
    public String toString() {
        return "Nacionalidad{" + "idNacionalidad=" + idNacionalidad + ", nombreNacionalidad=" + nombreNacionalidad + '}';
    }
    
}
