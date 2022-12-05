package claseconexionmysql;
import java.sql.*;
import java.util.Scanner;

public class ClaseConexionMySQL {

    static Connection conn;
    
    public static void conectarBaseDeDatos()
    {
        Conexion miConexion = new Conexion();
        conn = miConexion.conectar();
    }
    
    public static void guardarDatos(String nombres, String apellidos, String codigo)
    {
        PreparedStatement prepStatement = null;
        
        try
        {
            String query = "INSERT INTO ejemplo VALUES(null,?,?,?)";
            prepStatement = conn.prepareStatement(query);
            prepStatement.setString(1,nombres);
            prepStatement.setString(2,apellidos);
            prepStatement.setString(3,codigo);
            prepStatement.executeUpdate();
            System.out.println("Registro agregado correctamente.");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) 
    {
        conectarBaseDeDatos();
        Scanner read = new Scanner(System.in);
        
        String nombre;
        String apellido;
        String codigo;
        
        nombre = read.next();
        apellido = read.next();
        codigo = read.next();
        
        guardarDatos(nombre, apellido, codigo);
    }
}