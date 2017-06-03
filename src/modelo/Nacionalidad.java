package modelo;
/**
 *
 * @author
 */
public class Nacionalidad {
    private int idNacionalidad;
    private String nombreNacionalidad;

    public Nacionalidad() {
    }

    public Nacionalidad(int idNacionalidad, String nombreNacionalidad) {
        this.idNacionalidad = idNacionalidad;
        this.nombreNacionalidad = nombreNacionalidad;
    }

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
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
