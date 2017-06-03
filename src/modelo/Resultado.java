package modelo;
/**
 *
 * @author 
 */
public class Resultado {
    private int idResultado;
    private TarjetaAmarilla amarillaLocal ;
    private TarjetaAmarilla amarillaVisita;
    private TarjetaRoja rojaLocal ;
    private TarjetaRoja rojaVisita;
    private Gol golLocal ;
    private Gol golVisita ;
    private Gol penaltieLocal;
    private Gol penaltieVisita;
    private int llegadaLocal;
    private int llegadaVisita;
    private int cornerLocal;
    private int cornerVisita;
    private Partido partido;

    
    public Resultado() {
    }

    public Resultado(int idResultado, TarjetaAmarilla amarillaLocal, TarjetaAmarilla amarillaVisita, TarjetaRoja rojaLocal, TarjetaRoja rojaVisita, Gol golLocal, Gol golVisita, Gol penaltieLocal, Gol penaltieVisita, int llegadaLocal, int llegadaVisita, int cornerLocal, int cornerVisita, Partido partido) {
        this.idResultado = idResultado;
        this.amarillaLocal = amarillaLocal;
        this.amarillaVisita = amarillaVisita;
        this.rojaLocal = rojaLocal;
        this.rojaVisita = rojaVisita;
        this.golLocal = golLocal;
        this.golVisita = golVisita;
        this.penaltieLocal = penaltieLocal;
        this.penaltieVisita = penaltieVisita;
        this.llegadaLocal = llegadaLocal;
        this.llegadaVisita = llegadaVisita;
        this.cornerLocal = cornerLocal;
        this.cornerVisita = cornerVisita;
        this.partido = partido;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public TarjetaAmarilla getAmarillaLocal() {
        return amarillaLocal;
    }

    public void setAmarillaLocal(TarjetaAmarilla amarillaLocal) {
        this.amarillaLocal = amarillaLocal;
    }

    public TarjetaAmarilla getAmarillaVisita() {
        return amarillaVisita;
    }

    public void setAmarillaVisita(TarjetaAmarilla amarillaVisita) {
        this.amarillaVisita = amarillaVisita;
    }

    public TarjetaRoja getRojaLocal() {
        return rojaLocal;
    }

    public void setRojaLocal(TarjetaRoja rojaLocal) {
        this.rojaLocal = rojaLocal;
    }

    public TarjetaRoja getRojaVisita() {
        return rojaVisita;
    }

    public void setRojaVisita(TarjetaRoja rojaVisita) {
        this.rojaVisita = rojaVisita;
    }

    public Gol getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(Gol golLocal) {
        this.golLocal = golLocal;
    }

    public Gol getGolVisita() {
        return golVisita;
    }

    public void setGolVisita(Gol golVisita) {
        this.golVisita = golVisita;
    }

    public Gol getPenaltieLocal() {
        return penaltieLocal;
    }

    public void setPenaltieLocal(Gol penaltieLocal) {
        this.penaltieLocal = penaltieLocal;
    }

    public Gol getPenaltieVisita() {
        return penaltieVisita;
    }

    public void setPenaltieVisita(Gol penaltieVisita) {
        this.penaltieVisita = penaltieVisita;
    }

    public int getLlegadaLocal() {
        return llegadaLocal;
    }

    public void setLlegadaLocal(int llegadaLocal) {
        this.llegadaLocal = llegadaLocal;
    }

    public int getLlegadaVisita() {
        return llegadaVisita;
    }

    public void setLlegadaVisita(int llegadaVisita) {
        this.llegadaVisita = llegadaVisita;
    }

    public int getCornerLocal() {
        return cornerLocal;
    }

    public void setCornerLocal(int cornerLocal) {
        this.cornerLocal = cornerLocal;
    }

    public int getCornerVisita() {
        return cornerVisita;
    }

    public void setCornerVisita(int cornerVisita) {
        this.cornerVisita = cornerVisita;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Resultado{" + "idResultado=" + idResultado + ", amarillaLocal=" + amarillaLocal + ", amarillaVisita=" + amarillaVisita + ", rojaLocal=" + rojaLocal + ", rojaVisita=" + rojaVisita + ", golLocal=" + golLocal + ", golVisita=" + golVisita + ", penaltieLocal=" + penaltieLocal + ", penaltieVisita=" + penaltieVisita + ", llegadaLocal=" + llegadaLocal + ", llegadaVisita=" + llegadaVisita + ", cornerLocal=" + cornerLocal + ", cornerVisita=" + cornerVisita + ", partido=" + partido + '}';
    }
    
}
