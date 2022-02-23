package Conexion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.core.SqlCommand;

import Entidad.Usuario;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public interface iUserDAO {
    void insertar(Usuario  cl)throws SQLException;
    void actualizar(Usuario cl)throws SQLException;
    void eliminar(int codigo)throws SQLException;
    public int  traerId (Usuario id) throws SQLException;
    public ArrayList <Usuario> consultartodo()throws SQLException;
    void validarlogin(String name, String password)throws SQLException;
    void validarloginfx(TextField txtUser, PasswordField txtPassword)throws SQLException;
    
}
