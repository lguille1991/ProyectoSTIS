package modelo;
/**
 *
 * @author 
 */
public class TipoGol {
    private String idTipoGol;
    private String nombreGol;

    public TipoGol() {
    }

    public TipoGol(String idTipoGol, String nombreGol) {
        this.idTipoGol = idTipoGol;
        this.nombreGol = nombreGol;
    }

    public String getIdTipoGol() {
        return idTipoGol;
    }

    public void setIdTipoGol(String idTipoGol) {
        this.idTipoGol = idTipoGol;
    }

    public String getNombreGol() {
        return nombreGol;
    }

    public void setNombreGol(String nombreGol) {
        this.nombreGol = nombreGol;
    }

    @Override
    public String toString() {
        return "Tipo_Gol{" + "idTipoGol=" + idTipoGol + ", nombreGol=" + nombreGol + '}';
    }
  
}
