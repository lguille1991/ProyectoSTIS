package controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;

/**
 *
 * @author Luis Martinez
 */
public class ControlJugador implements OperacionesJugador{

    @Override
    public String agregarJugador(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Jugador jug =(Jugador) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into jugador values("+jug.getIdJugador()+","+jug.getIdEquipo()+",'"+jug.getPosicion()+"','"+jug.getNombreJugador()+"','"+jug.getFechaNac()+"',"+jug.getNumeroDorsal()+")";
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
    public String modificarJugador(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Jugador jug =(Jugador) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update jugador set idEquipo="+jug.getIdEquipo()+",posicion='"+jug.getPosicion()+"',nombreJugador='"+jug.getNombreJugador()+"',fechaNac='"+jug.getFechaNac()+"',numeroDorsal="+jug.getNumeroDorsal()+" where idJugador="+jug.getIdJugador();
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
    public String eliminarJugador(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Jugador jug =(Jugador) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from jugador where idJugador="+jug.getIdJugador();
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
    public List mostrarJugador() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listajugadores = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select jugador.idJugador, jugador.idEquipo, equipo.nombreEquipo, jugador.posicion, jugador.nombreJugador, "
                + "jugador.fechaNac, jugador.numeroDorsal from jugador inner join equipo on jugador.idEquipo=equipo.idEquipo";
            res=st.executeQuery(sql);
            while(res.next()){
                listajugadores.add(new Jugador(
                        res.getInt("idJugador"),
                        res.getString("nombreJugador"),
                        res.getString("fechaNac"),
                        res.getInt("numeroDorsal"),
                        res.getString("posicion"),
                        res.getInt("idEquipo"),
                        res.getString("nombreEquipo")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listajugadores;
    }

    @Override
    public List llenarComboEquipo() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List nombreEquipo = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from equipo";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               nombreEquipo.add(res.getString("nombreEquipo"));     
            }  
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return nombreEquipo;
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
}
