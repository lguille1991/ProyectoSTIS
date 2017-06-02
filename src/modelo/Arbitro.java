package modelo;
/**
 *
 * @author
 */
public class Arbitro {
    private int idArbitro;
    private String nombreArbitro;
    private String tipo;
    private String fechaNac;
    private int idNacionalidad;

    public Arbitro() {
    }

    public Arbitro(int idArbitro, String nombreArbitro, String tipo, String fechaNac, int idNacionalidad) {
        this.idArbitro = idArbitro;
        this.nombreArbitro = nombreArbitro;
        this.tipo = tipo;
        this.fechaNac = fechaNac;
        this.idNacionalidad = idNacionalidad;
    }

    public int getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(int idArbitro) {
        this.idArbitro = idArbitro;
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

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }
//
//   //METODOS 
//    public void imprimir()
//    {
//         System.out.println("Nombre arbitro:"+ nombreArbitro + "Tipo:" + tipo + "Fecha Nacimiento:" + fechaNac + "Nacionalidad:" + nacionalidad);
//    }
    
}
