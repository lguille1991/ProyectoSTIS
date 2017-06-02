package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Arbitro;

/**
 *
 * @author Luis Martinez
 */
public class ControlArbitro implements OperacionesArbitro{

    @Override
    public String agregarArbitro(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Arbitro ar =(Arbitro) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into arbitro values("+ar.getIdArbitro()+","+ar.getIdNacionalidad()+",'"+ar.getNombreArbitro()+"','"+ar.getFechaNac()+"','"+ar.getTipo()+"')";
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
    public String modificarArbitro(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Arbitro ar = (Arbitro) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update equipo set idNacionalidad="+ar.getIdNacionalidad()+",nombreArbitro='"+ar.getNombreArbitro()+"',fechaNac='"+ar.getFechaNac()+"',tipoArbitro='"+ar.getTipo()+"' where idArbitro="+ar.getIdArbitro();
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
    public String eliminarArbitro(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Arbitro ar=(Arbitro) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from arbitro where idArbitro="+ar.getIdArbitro();
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
    public List mostrarArbitro() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listaarbitros = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select * from arbitro";
            res=st.executeQuery(sql);
            while(res.next()){
                listaarbitros.add(new Arbitro(
                        res.getInt("idArbitro"),
                        res.getString("nombreArbitro"),
                        res.getString("fechaNac"),
                        res.getString("tipoArbitro"),
                        res.getInt("idNacionalidad")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaarbitros;
    }
    
    @Override
    public List llenarComboBox() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List nacionalidad = new ArrayList();
      try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from nacionalidad";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               nacionalidad.add(res.getString("nombreNacionalidad"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return nacionalidad;
    }
    
    @Override
    public int llenarId(String nombreNacion)
    {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idNacion = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idNacionalidad from nacionalidad where nombreNacionalidad = '"+nombreNacion+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idNacion = res.getInt("idNacionalidad");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            
        }
        return idNacion;
    }
    
}
