package controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.TarjetaAmarilla;

/**
 *
 * @author Maria Jose
 */
public class ControlTarjetaAmarilla implements OperacionesTarjetaAmarilla {

    @Override
    public String agregarTarjetaA(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        TarjetaAmarilla ta =(TarjetaAmarilla) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into tarjetaamarilla values("+ta.getIdTarjetaAmarilla()+","+ta.getIdJugador()+","+ta.getMinuto()+")";
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
    public String modificarTarjetaA(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        TarjetaAmarilla ta =(TarjetaAmarilla) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update tarjetaamarilla set minuto="+ta.getMinuto()+",idJugador="+ta.getIdJugador()+" where idTarjetaAmarilla="+ta.getIdTarjetaAmarilla();
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
    public String eliminarTarjetaA(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        TarjetaAmarilla ta =(TarjetaAmarilla) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from tarjetaamarilla where idTarjetaAmarilla="+ta.getIdTarjetaAmarilla();
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
    public List mostrarTarjetaA() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listaamarilla = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select ta.idTarjetaAmarilla, ta.idJugador, j.nombreJugador, ta.minuto,e.idEquipo, e.nombreEquipo " 
                   +"from tarjetaAmarilla ta inner join jugador j on ta.idJugador= j.idJugador " 
                    + "inner join equipo e on j.idEquipo= e.idEquipo ";
            res=st.executeQuery(sql);
            while(res.next()){
                listaamarilla.add(new TarjetaAmarilla(
                        res.getInt("idTarjetaAmarilla"),
                        res.getInt("minuto"),
                        res.getInt("idEquipo"),
                        res.getString("nombreEquipo"),
                        res.getInt("idJugador"),
                        res.getString("nombreJugador")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaamarilla;
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
    public List llenarComboBoxJugador(int idEquipo) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List jugador = new ArrayList();
      try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from jugador where idEquipo="+idEquipo;
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               jugador.add(res.getString("nombreJugador"));     
            }  
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return jugador;
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
    public int llenarIdJugador(String nombreJugador) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idJugador = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idJugador from jugador where nombreJugador = '"+nombreJugador+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idJugador = res.getInt("idJugador");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return idJugador; 
    }

 
}
