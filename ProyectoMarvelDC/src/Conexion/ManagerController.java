package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManagerController 
{
     static String URL = "jdbc:postgresql://localhost:5432/ProyectoPag";
     static String USUARIO = "postgres";
     static String CLAVE = "1234";

    public static  Connection obtenerConexion()
    {
        Connection conn = null;

        try 
        { 
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(URL,USUARIO, CLAVE);
            System.out.println("CONEXIÓN REALIZADA SATISFACTORIAMENTE");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
        catch(SQLException ex)
        {
            System.out.println("Error en url  de PostgreSQL: " + ex);
        }

        return conn;
    }
}
