package controlador;

import conexion.Conexion;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author Luis Martinez
 */
public class ControlEmpleado implements OperacionesEmpleado{

    @Override
    public String agregarEmpleado(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Empleado em =(Empleado) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="insert into empleado values("+em.getIdEmpleado()+",'"+em.getCargo()+"','"+em.getNombreEmpleado()+"')";
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
    public String modificarEmpleado(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Empleado em = (Empleado) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="update empleado set cargo='"+em.getCargo()+"',nombreEmpleado='"+em.getNombreEmpleado()+"' where idEmpleado="+em.getIdEmpleado()+"";
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
    public String eliminarEmpleado(Object obj) {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        String msj=null;
        Empleado em=(Empleado) obj;
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="delete from empleado where idEmpleado="+em.getIdEmpleado();
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
    public List mostrarEmpleado() {
        Conexion con = new Conexion();
        Connection cn;
        ResultSet res;
        Statement st;
        String sql;
        List listaempleados = new ArrayList();
        try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            st=cn.createStatement();
            sql="select * from empleado";
            res=st.executeQuery(sql);
            while(res.next()){
                listaempleados.add(new Empleado(
                        res.getInt("idEmpleado"),
                        res.getString("nombreEmpleado"),
                        res.getString("cargo")
                ));
            }
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaempleados;
    }

    @Override
    public List llenarComboBox() {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pre;
        ResultSet res;
        Statement st;
        String sql;
        List cargo = new ArrayList();
      try{
            Class.forName(con.getDriver());
            cn=DriverManager.getConnection(con.getUrl(),con.getUser(),con.getClave());
            sql="select cargo from empleado";
            st=cn.prepareStatement(sql);
            res = st.executeQuery(sql);
            while(res.next()){
               cargo.add(res.getString("cargo"));     
            }  
        
            res.close();
            cn.close();
            st.close();
        }catch(Exception e){
           e.printStackTrace();
        }
          return cargo;
    }
    
}
