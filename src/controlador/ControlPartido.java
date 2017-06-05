package controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Partido;

/**
 *
 * @author Luis Martinez
 */
public class ControlPartido implements OperacionesPartido{

    @Override
    public String agregarPartido(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Partido pa =(Partido) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into partido values("+pa.getIdTorneo()+","+pa.getIdEquipoLocal()+","+pa.getIdEquipoVisitante()+","+pa.getIdEstadio()+
                    ",'"+pa.getFecha()+"',"+pa.getIdArbitro()+","+pa.getIdHorario()+","+pa.getIdJornada()+")";
            st.executeUpdate(sql);
            st.close();
            cn.close();
            msj="Datos insertados correctamente";
        }catch(Exception e){
            msj=e.toString();
        }
        return msj;
    }

    @Override
    public String modificarPartido(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Partido pa =(Partido) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update partido set idTorneo="+pa.getIdTorneo()+",idEquipoLocal="+pa.getIdEquipoLocal()+",idEquipoVisitante="+pa.getIdEquipoVisitante()+
                 ",idEstadio="+pa.getIdEstadio()+",fecha='"+pa.getFecha()+",idArbitro="+pa.getIdArbitro()+
                    ",idHorario="+pa.getIdHorario()+",idJornada="+pa.getIdJornada()+" where idPartido="+pa.getIdPartido();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            msj="Datos actualizados correctamente";
        }catch(Exception e){
            msj=e.toString();
        }
        return msj;
    }

    @Override
    public String eliminarPartido(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Partido pa =(Partido) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from partido where idPartido="+pa.getIdPartido();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            msj="Datos eliminados correctamente";
        }catch(Exception e){
            msj=e.toString();
        }
        return msj;
    }

    @Override
    public List mostrarPartido() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listapartidos = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select partido.idPartido, partido.idTorneo, torneo.nombreTorneo, partido.idEquipoLocal, E1.nombreEquipo, "
                + "partido.idEquipoVisitante, E2.nombreEquipo, partido.idEstadio, estadio.nombreEstadio, partido.fecha, "
                + "partido.idArbitro, arbitro.nombreArbitro, partido.idHorario, horario.dia, horario.hora, partido.idJornada, "
                + "jornada.nombreJornada "
                + "from partido inner join torneo on partido.idTorneo=torneo.idTorneo "
                + "inner join equipo E1 on partido.idEquipoLocal=E1.idEquipo inner join equipo E2 on partido.idEquipoVisitante=E2.idEquipo "
                + "inner join estadio on partido.idEstadio=estadio.idEstadio inner join arbitro on partido.idArbitro=arbitro.idArbitro "
                + "inner join horario on partido.idHorario=horario.idHorario inner join jornada on partido.idJornada=jornada.idJornada";
            res=st.executeQuery(sql);
            while(res.next()){
                listapartidos.add(new Partido(
                        res.getInt("partido.idPartido"),
                        res.getInt("partido.idTorneo"),
                        res.getString("torneo.nombreTorneo"),
                        res.getInt("partido.idEquipoLocal"),
                        res.getString("E1.nombreEquipo"),
                        res.getInt("partido.idEquipoVisitante"),
                        res.getString("E2.nombreEquipo"),
                        res.getInt("partido.idEstadio"),
                        res.getString("estadio.nombreEstadio"),
                        res.getString("partido.fecha"),
                        res.getInt("partido.idArbitro"),
                        res.getString("arbitro.nombreArbitro"),
                        res.getInt("partido.idHorario"),
                        res.getString("horario.dia"),
                        res.getString("horario.hora"),
                        res.getInt("partido.idJornada"),
                        res.getString("jornada.nombreJornada")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listapartidos;
    }

    @Override
    public List llenarComboBoxTorneo() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List torneo = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from torneo";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               torneo.add(res.getString("nombreTorneo"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return torneo;
    }

    @Override
    public List llenarComboBoxEquipo() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List equipo = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from equipo";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               equipo.add(res.getString("nombreEquipo"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return equipo;
    }

    @Override
    public List llenarComboBoxEstadio() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List estadio = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from estadio";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               estadio.add(res.getString("nombreEstadio"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return estadio;
    }

    @Override
    public List llenarComboBoxArbitro() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List arbitro = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from arbitro";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               arbitro.add(res.getString("nombreArbitro"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return arbitro;
    }

    @Override
    public List llenarComboBoxJornada() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List jornada = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from jornada";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               jornada.add(res.getString("nombreJornada"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return jornada;
    }

    @Override
    public List llenarComboBoxHorario() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List horario = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from horario";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               horario.add(res.getString("idHorario"));
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return horario;
    }

    @Override
    public int llenarIdTorneo(String nombreTorneo) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idTorneo = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idTorneo from torneo where nombreTorneo = '"+nombreTorneo+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idTorneo = res.getInt("idTorneo");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return idTorneo;
    }

    @Override
    public int llenarIdEquipo(String nombreEquipo) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idEquipo = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idEquipo from equipo where nombreEquipo = '"+nombreEquipo+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idEquipo = res.getInt("idEquipo");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return idEquipo;
    }

    @Override
    public int llenarIdEstadio(String nombreEstadio) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idEstadio = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idEstadio from estadio where nombreEstadio = '"+nombreEstadio+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idEstadio = res.getInt("idEstadio");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return idEstadio;
    }

    @Override
    public int llenarIdArbitro(String nombreArbitro) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idArbitro = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idArbitro from arbitro where nombreArbitro = '"+nombreArbitro+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idArbitro = res.getInt("idArbitro");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return idArbitro;
    }

    @Override
    public int llenarIdJornada(String nombreJornada) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idJornada = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idJornada from jornada where nombreJornada = '"+nombreJornada+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idJornada = res.getInt("idJornada");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return idJornada;
    }

    @Override
    public String llenarDia(int idHorario) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        String dia = "00:00";
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select dia from horario where idHorario = '"+idHorario+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               dia = res.getString("dia");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return dia;
    }

    @Override
    public String llenarHora(int idHorario) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        String hora = "00:00";
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select hora from horario where idHorario = '"+idHorario+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               hora = res.getString("hora");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return hora;
    }
    
}
