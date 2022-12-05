package claseconexionmysql;
import java.sql.*;


public class Conexion {
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/ejemplo";
    //Driver, protocolo, detalles de la conexion
    
    String username = "root";
    String password = "root";
    
    Connection conn = null;
    
    public Connection conectar()
    {
        try
        {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado exitosamente!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return conn;
    }

    
}