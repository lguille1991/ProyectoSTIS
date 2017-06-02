package conexion;

/**
 *
 * @author Luis Martinez
 */
public class Conexion {
    private String driver;
    private String url;
    private String user;
    private String clave;

    public Conexion() {
        this.driver="com.mysql.jdbc.Driver";
        this.url="jdbc:mysql://localhost:3306/bd_torneo";
        this.user="root";
        this.clave="";
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }  
}
