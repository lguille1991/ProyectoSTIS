package modelo;
/**
 *
 * @author 
 */
public class Horario {
    private int idHorario;
    private String dia;
    private String hora;

    public Horario() {
    }

    public Horario(int idHorario, String dia, String hora) {
        this.idHorario = idHorario;
        this.dia = dia;
        this.hora = hora;
    }

   

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", dia=" + dia + ", hora=" + hora + '}';
    }
    
    
    
}
