package Controladores;

import java.beans.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


import Conexion.ManagerController;
import Conexion.UserDAO;
import Conexion.iUserDAO;
import Entidad.Usuario;
import Main.MainVista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;

public class LoginController2 implements Initializable {

    iUserDAO DAOuser = new UserDAO();
    ArrayList<Usuario> datos;
    
    @FXML
    private Button btnCerrar;

   

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUser;

    @FXML
    public void eventAction(ActionEvent event) throws IOException {
        iUserDAO dao = new UserDAO();
        String name = txtUser.getText();
        String pass = txtPassword.getText();
        try {
            
            dao.validarlogin(name, pass);
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

    @FXML
    void actCerrar(ActionEvent event) {
        System.exit(0);
    }





    public void terceraforma(ActionEvent event) throws IOException {

        String user = txtUser.getText().trim();
        String pass = txtPassword.getText().trim();

       String userv;
       String passv; 

        if (user.equals("")|| pass.equals("")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Falta un campo");
            alert.showAndWait();

        }else{
            
            try {
                
                datos=DAOuser.consultartodo();
                System.out.println(datos.get(0));
                
                
            } catch (SQLException e) {
                //TODO: handle exception
                e.printStackTrace();
            }

        }

    }

    
    public void validarlogin(){
    }

    @FXML
    public void eventKey(KeyEvent event) {
    
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

}
