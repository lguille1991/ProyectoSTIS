package modelo;
/**
 *
 * @author 
 */
public class Clasificacion {
    private String idClasificacion;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesFavor;
    private int golesContra;
    private int diferenciaGoles;
    private int puntos;
    private Equipo equipo;

    public Clasificacion() {
    }

    public Clasificacion(String idClasificacion, int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesFavor, int golesContra, int diferenciaGoles, int puntos, Equipo equipo) {
        this.idClasificacion = idClasificacion;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferenciaGoles = diferenciaGoles;
        this.puntos = puntos;
        this.equipo = equipo;
    }

    public String getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(String idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "idClasificacion=" + idClasificacion + ", partidosJugados=" + partidosJugados + ", partidosGanados=" + partidosGanados + ", partidosEmpatados=" + partidosEmpatados + ", partidosPerdidos=" + partidosPerdidos + ", golesFavor=" + golesFavor + ", golesContra=" + golesContra + ", diferenciaGoles=" + diferenciaGoles + ", puntos=" + puntos + ", equipo=" + equipo + '}';
    }

    
}
