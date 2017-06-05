package modelo;
/**
 *
 * @author
 */
public class Partido {
    private int idPartido;
    private int idTorneo;
    private String nombreTorneo;
    private int idEquipoLocal;
    private String nombreEquipoLocal;
    private int idEquipoVisitante;
    private String nombreEquipoVisitante;
    private int idEstadio;
    private String estadio;
    private String fecha;
    private int idArbitro;
    private String nombreArbitro;
    private int idHorario;
    private String dia;
    private String hora;
    private int idJornada;
    private String nombreJornada;

    public Partido() {
    }

    public Partido(int idPartido, int idTorneo, String nombreTorneo, int idEquipoLocal, String nombreEquipoLocal, int idEquipoVisitante, String nombreEquipoVisitante, int idEstadio, String estadio, String fecha, int idArbitro, String nombreArbitro, int idHorario, String dia, String hora, int idJornada, String nombreJornada) {
        this.idPartido = idPartido;
        this.idTorneo = idTorneo;
        this.nombreTorneo = nombreTorneo;
        this.idEquipoLocal = idEquipoLocal;
        this.nombreEquipoLocal = nombreEquipoLocal;
        this.idEquipoVisitante = idEquipoVisitante;
        this.nombreEquipoVisitante = nombreEquipoVisitante;
        this.idEstadio = idEstadio;
        this.estadio = estadio;
        this.fecha = fecha;
        this.idArbitro = idArbitro;
        this.nombreArbitro = nombreArbitro;
        this.idHorario = idHorario;
        this.dia = dia;
        this.hora = hora;
        this.idJornada = idJornada;
        this.nombreJornada = nombreJornada;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public int getIdEquipoLocal() {
        return idEquipoLocal;
    }

    public void setIdEquipoLocal(int idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }

    public String getNombreEquipoLocal() {
        return nombreEquipoLocal;
    }

    public void setNombreEquipoLocal(String nombreEquipoLocal) {
        this.nombreEquipoLocal = nombreEquipoLocal;
    }

    public int getIdEquipoVisitante() {
        return idEquipoVisitante;
    }

    public void setIdEquipoVisitante(int idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }

    public String getNombreEquipoVisitante() {
        return nombreEquipoVisitante;
    }

    public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
        this.nombreEquipoVisitante = nombreEquipoVisitante;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    public String getNombreJornada() {
        return nombreJornada;
    }

    public void setNombreJornada(String nombreJornada) {
        this.nombreJornada = nombreJornada;
    }

    @Override
    public String toString() {
        return "Partido{" + "idPartido=" + idPartido + ", idTorneo=" + idTorneo + ", nombreTorneo=" + nombreTorneo + ", idEquipoLocal=" + idEquipoLocal + ", nombreEquipoLocal=" + nombreEquipoLocal + ", idEquipoVisitante=" + idEquipoVisitante + ", nombreEquipoVisitante=" + nombreEquipoVisitante + ", idEstadio=" + idEstadio + ", estadio=" + estadio + ", fecha=" + fecha + ", idArbitro=" + idArbitro + ", nombreArbitro=" + nombreArbitro + ", idHorario=" + idHorario + ", dia=" + dia + ", hora=" + hora + ", idJornada=" + idJornada + ", nombreJornada=" + nombreJornada + '}';
    }

    

}
