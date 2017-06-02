package modelo;
/**
 *
 * @author
 */
public class Partido {
    private String idPartido;
    private Equipo equipoLocal;
    private Equipo equipoVisita;
    private Estadio estadio;
    private Horario horario;
    private Arbitro arbitro;
    private Jornada jornadas;

    public Partido() {
    }

    public Partido(String idPartido, Equipo equipoLocal, Equipo equipoVisita, Estadio estadio, Horario horario, Arbitro arbitro, Jornada jornadas) {
        this.idPartido = idPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisita = equipoVisita;
        this.estadio = estadio;
        this.horario = horario;
        this.arbitro = arbitro;
        this.jornadas = jornadas;
    }

    public String getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(Equipo equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Jornada getJornadas() {
        return jornadas;
    }

    public void setJornadas(Jornada jornadas) {
        this.jornadas = jornadas;
    }

    @Override
    public String toString() {
        return "Partido{" + "idPartido=" + idPartido + ", equipoLocal=" + equipoLocal + ", equipoVisita=" + equipoVisita + ", estadio=" + estadio + ", horario=" + horario + ", arbitro=" + arbitro + ", jornadas=" + jornadas + '}';
    }
   
}
