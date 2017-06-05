package controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Torneo;

/**
 *
 * @author Luis Martinez
 */
public class ControlTorneo implements OperacionesTorneo{

    @Override
    public String agregarTorneo(Object obj) {//Con llave primaria
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Torneo tor =(Torneo) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into torneo values("+tor.getIdTorneo()+",'"+tor.getNombreTorneo()+"','"+tor.getFechaInicio()+"','"+tor.getFechaFinal()+"',"+tor.getIdUsuario()+")";
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
    public String modificarTorneo(Object obj) {//Con llave primaria
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Torneo tor = (Torneo) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update torneo set idTorneo="+tor.getIdTorneo()+",nombreTorneo='"+tor.getNombreTorneo()+"',fechaInicio='"+tor.getFechaInicio()+"',fechaFinal='"+tor.getFechaFinal()+"',idUsuario="+tor.getIdUsuario()+" where idTorneo="+tor.getIdTorneo()+"";
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
    public String eliminarTorneo(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Torneo tor=(Torneo) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from torneo where idTorneo="+tor.getIdTorneo();
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
    public List mostrarTorneo() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listatorneos = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select torneo.idTorneo, torneo.nombreTorneo, torneo.fechaInicio, torneo.fechaFinal, "
                + "torneo.idUsuario, usuario.nombreUsuario from torneo inner join usuario on torneo.idUsuario=usuario.idUsuario";
            res=st.executeQuery(sql);
            while(res.next()){
                listatorneos.add(new Torneo(
                        res.getInt("idTorneo"),
                        res.getString("nombreTorneo"),
                        res.getString("fechaInicio"),
                        res.getString("fechaFinal"),
                        res.getInt("idUsuario"),
                        res.getString("nombreUsuario")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listatorneos;
    } 

    @Override
    public List llenarComboBoxUsuario() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List usuario = new ArrayList();
      try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from usuario";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               usuario.add(res.getString("nombreUsuario"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return usuario;
    }

    @Override
    public int llenarIdUsuario(String nombreUsuario) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idUsuario = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idUsuario from usuario where nombreUsuario = '"+nombreUsuario+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idUsuario = res.getInt("idUsuario");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            e.toString();
        }
        return idUsuario;
    }
}
