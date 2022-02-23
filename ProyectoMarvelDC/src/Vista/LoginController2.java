package Vista;

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



    public void segundafora(ActionEvent event) throws IOException {
        MainVista mv = new MainVista();
        if (txtUser.getText().equals("jeff") && txtPassword.getText().equals("1234")){
         mv.checkLogin("/Vista/frmPrincipal2.fxml");   
        }else {
            System.out.println("dato incorrecto");
        }

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

    public void cuartaforma(ActionEvent event)throws IOException{
        
        String username = txtUser.getText();
        String password= txtPassword.getText();
        Connection cn =null;
        PreparedStatement ps  = null;
 
        ResultSet rs= null;

        

        try {
             final String URL = "jdbc:postgresql://localhost:5432/ProyectoPag";
     final String USUARIO = "postgres";
     final String CLAVE = "1234";
            cn = DriverManager.getConnection(URL, USUARIO, CLAVE);
            ps = cn.prepareStatement("select pass_user from usuario where name_user =?");
            rs = ps.executeQuery();
            if(!rs.isBeforeFirst()){
                System.out.println("Usuario no encontrado");
                Alert alert  = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Ingrese las credenciales correctas!");
                alert.show();

            

            }else{
                while(rs.next()){
                    String recuperarpass = rs.getString("pass_user");
                    if (recuperarpass.equals(password)){
                        MainVista mv = new MainVista();
                        mv.checkLogin("/Vista/frmPrincipal.fxml");   
                    }else{
                        System.out.println("Password incorrecta");
                        Alert alert  = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Ingrese the correct password!");
                        alert.show();

                    }
                }
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
            //TODO: handle exception
        }finally{
            if(rs !=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    //TODO: handle exception
                }

            }
            if (ps != null){
                try {
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    //TODO: handle exception
                }
            }

            if (cn !=null){
                try {
                    cn.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
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
