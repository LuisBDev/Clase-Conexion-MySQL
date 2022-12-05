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
    
    public static void main(String[] args) 
    {
        conectarBaseDeDatos();
    }
}