package controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Gol;

/**
 *
 * @author Luis Martinez
 */
public class ControlGol implements OperacionesGol{

    @Override
    public String agregarGol(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Gol go =(Gol) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into gol values("+go.getIdGol()+","+go.getIdTipoGol()+","+go.getIdJugador()+","+go.getMinuto()+")";
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
    public String modificarGol(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Gol go =(Gol) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update gol set idTipoGol="+go.getIdTipoGol()+",idJugador='"+go.getIdJugador()+",minuto="+go.getMinuto()+" where idGol="+go.getIdGol();
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
    public String eliminarGol(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Gol go =(Gol) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from gol where idGol="+go.getIdGol();
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
    public List mostrarGol() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listagoles = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select gol.idGol, gol.idTipoGol, tipo_gol.nombreTipoGol, gol.idJugador, jugador.nombreJugador, jugador.idEquipo, "
                + "equipo.nombreEquipo, gol.minuto from gol inner join tipo_gol on gol.idTipoGol=tipo_gol.idTipo_Gol "
                + "inner join jugador on gol.idJugador=jugador.idJugador inner join equipo on jugador.idEquipo=equipo.idEquipo";
            res=st.executeQuery(sql);
            while(res.next()){
                listagoles.add(new Gol(
                        res.getInt("idGol"),
                        res.getInt("idTipoGol"),
                        res.getString("nombreGol"),
                        res.getInt("idEquipo"),
                        res.getString("nombreEquipo"),
                        res.getInt("idJugador"),
                        res.getString("nombreJugador"),
                        res.getInt("minuto")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listagoles;
    }

    @Override
    public int llenarIdTipo(String nombreTipoGol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int llenarIdEquipo(String nombreEquipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int llenarIdJugador(String nombreJugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   

    @Override
    public List llenarComboBoxTipo() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List tipo = new ArrayList();
      try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from tipo_gol";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               tipo.add(res.getString("nombreTipoGol"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return tipo;
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
    public List llenarComboBoxJugador() {
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
            sql="select * from jugador";
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
}
