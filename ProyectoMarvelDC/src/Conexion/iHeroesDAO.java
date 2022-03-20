package Conexion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.postgresql.core.SqlCommand;

import Entidad.Heroes;

public interface iHeroesDAO {
    //void insertar(Heroes  heroes)throws SQLException, FileNotFoundException;
    void insertarDatos(Heroes heroes) throws SQLException, FileNotFoundException, IOException;
    void actualizar(Heroes heroes)throws SQLException, FileNotFoundException, IOException;
    void eliminar(int codigo)throws SQLException;
    public List <Heroes> consultartodo()throws SQLException;
    public List <Heroes> consultarfiltro(String name)throws SQLException;
    
    

}
