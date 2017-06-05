package controlador;

import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public interface OperacionesPartido {
    public String agregarPartido(Object obj);
    public String modificarPartido(Object obj);
    public String eliminarPartido(Object obj);
    public List mostrarPartido();
    public List llenarComboBoxTorneo();
    public List llenarComboBoxEquipo();
    public List llenarComboBoxEstadio();
    public List llenarComboBoxArbitro();
    public List llenarComboBoxJornada();
    public List llenarComboBoxHorario();
    public int llenarIdTorneo(String nombreTorneo);
    public int llenarIdEquipo(String nombreEquipo);
    public int llenarIdEstadio(String nombreEstadio);
    public int llenarIdArbitro(String nombreArbitro);
    public int llenarIdJornada(String nombreJornada);
    public String llenarDia(int idHorario);
    public String llenarHora(int idHorario);
    
}
