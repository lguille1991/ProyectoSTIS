package modelo;
/**
 *
 * @author
 */
public class Arbitro {
    private int idArbitro;
    private int idNacionalidad;
    private String nombreNacionalidad;
    private String nombreArbitro;
    private String tipo;
    private String fechaNac;
    

    public Arbitro() {
    }

    public Arbitro(int idArbitro, int idNacionalidad, String nombreNacionalidad, String nombreArbitro, String tipo, String fechaNac) {
        this.idArbitro = idArbitro;
        this.idNacionalidad = idNacionalidad;
        this.nombreNacionalidad = nombreNacionalidad;
        this.nombreArbitro = nombreArbitro;
        this.tipo = tipo;
        this.fechaNac = fechaNac;
    }

    public int getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(int idArbitro) {
        this.idArbitro = idArbitro;
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

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
