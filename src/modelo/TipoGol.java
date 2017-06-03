package modelo;
/**
 *
 * @author 
 */
public class TipoGol {
    private int idTipoGol;
    private String nombreGol;

    public TipoGol() {
    }

    public TipoGol(int idTipoGol, String nombreGol) {
        this.idTipoGol = idTipoGol;
        this.nombreGol = nombreGol;
    }

    public int getIdTipoGol() {
        return idTipoGol;
    }

    public void setIdTipoGol(int idTipoGol) {
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
        return "TipoGol{" + "idTipoGol=" + idTipoGol + ", nombreGol=" + nombreGol + '}';
    }
  
}
