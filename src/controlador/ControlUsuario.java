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
            sql="insert into usuario values("+us.getIdUsuario()+","+us.getIdEmpleado()+",'"+us.getNombreUsuario()+"','"+us.getContrasena()+"',"+us.getIdRol()+")";
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
            sql="update usuario set idEmpleado="+us.getIdEmpleado()+",nombreUsuario='"+us.getNombreUsuario()+"',contrasena='"+us.getContrasena()+",idRol="+us.getIdRol()+" where idUsuario="+us.getIdUsuario();
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
        Usuario go =(Usuario) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from usuario where idUsuario="+go.getIdUsuario();
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
        List listausuario = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select usuario.idUsuario, usuario.nombreUsuario, usuario.contrasena, empleado.idEmpleado, empleado.nombreEmpleado, "
                + "rol_usuario.idRol, rol_usuario.nombreRol from usuario inner join empleado on usuario.idEmpleado=empleado.IdEmpleado "
                + "inner join rol_usuario on usuario.idRol=rol_usuario.idRol";
            res=st.executeQuery(sql);
            while(res.next()){
                listausuario.add(new Usuario(
                        res.getInt("idUsuario"),
                        res.getString("nombreusuario"),
                        res.getString("contrasena"),
                        res.getInt("idEmpleado"),
                        res.getString("nombreEmpleado"),
                        res.getInt("idRol"),
                        res.getString("nombreRol")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listausuario;
    }

    @Override
    public List llenarComboBoxEmpleado() {
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
            sql="select * from empleado";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               tipo.add(res.getString("nombreEmpleado"));     
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
    public int llenarIdEmpleado(String nombreEmpleado) {
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
            sql="select idEmpleado from equipo where nombreEmpleado = '"+nombreEmpleado+"'";
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
            e.toString();
        }
        return idEmpleado;
    }

    @Override
    public List llenarComboBoxRol(String cargo) {
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
            sql="select * from rol_usuario where nombreRol='"+cargo+"'";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               usuario.add(res.getString("nombreRol"));     
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
    public int llenarIdRol(String nombreRol) {
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
            e.toString();
        }
        return idR; 
    }

    
}
