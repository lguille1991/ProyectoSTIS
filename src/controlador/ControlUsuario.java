package controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Luis Martinez
 */
public class ControlUsuario implements OperacionesUsuario{

    @Override
    public String agregarUsuario(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Usuario us =(Usuario) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into usuario values("+us.getIdUsuario()+","+us.getIdRol()+","+us.getIdEmpleado()+",'"+us.getContrasena()+"')";
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
    public String modificarUsuario(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Usuario us =(Usuario) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update usuario set idRol="+us.getIdRol()+"', idEmpleado="+us.getIdEmpleado()+"',contrasena='"+us.getContrasena()+"' where idUsuario="+us.getIdUsuario();
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
    public String eliminarUsuario(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Usuario us =(Usuario) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from usuario where idUsuario="+us.getIdUsuario();
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
    public List mostrarUsuario() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listaUsuario = new ArrayList();
        try{
        Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select idUsuario, contrasena, usuario.idRol, nombreRol, "
                    + "usuario.idEmpleado, nombreEmpleado from usuario inner join rol_usuario on usuario.idRol=rol_usuario.idRol inner join empleado on usuario.idEmpleado=empleado.idEmpleado";
            res=st.executeQuery(sql);
            while(res.next()){
                listaUsuario.add(new Usuario(
                        res.getInt("idUsuario"),
                        res.getString("contrasena"),
                        res.getInt("idRol"),
                        res.getString("nombreRol"),
                        res.getInt("idEmpleado"),
                        res.getString("nombreEmpleado")        
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaUsuario;
    }
    
    @Override
    public List llenarComboBoxRol() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List rol_usuario = new ArrayList();
      try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from rol_usuario";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               rol_usuario.add(res.getString("nombreRol"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return rol_usuario;
    }
    
    @Override
    public int llenarIdRol(String nombreRol)
    {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idR = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idRol from rol_usuario where nombreRol = '"+nombreRol+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idR = res.getInt("idRol");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            
        }
        return idR;
    }
    
    @Override
    public List llenarComboBoxEmpleado() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List rol_usuario = new ArrayList();
      try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select * from empleado";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               rol_usuario.add(res.getString("nombreEmpleado"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return rol_usuario;
    }
    
    @Override
    public int llenarIdEmpleado(String nombreEmple)
    {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        int idEmpleado = 0;
        
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select idEmpleado from empleado where nombreEmpleado = '"+nombreEmple+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            
            while(res.next()){
               idEmpleado = res.getInt("idEmpleado");     
            }  
        
            res.close();
            cn.close();
            st.close();
            
        }catch(Exception e)
        {
            
        }
        return idEmpleado;
    }
}
