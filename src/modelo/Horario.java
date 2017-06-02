package modelo;
/**
 *
 * @author 
 */
public class Horario {
    private String idHorario;
    private String fecha;
    private String hora;

    public Horario() {
    }

    public Horario(String idHorario, String fecha, String hora) {
        this.idHorario = idHorario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
}
