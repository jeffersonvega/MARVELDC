package Conexion;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidad.Usuario;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserDAO implements iUserDAO{


    @Override
    public ArrayList<Usuario> consultartodo() throws SQLException {
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Usuario> UsuarioList = new ArrayList<>();
        Usuario cl;

        try
        {
            con =  ManagerController.obtenerConexion();
            ps = con.prepareStatement("SELECT * FROM usuario");

            rs = ps.executeQuery();

            while(rs.next())
            {
                cl = new Usuario();

                cl.setIduser(rs.getInt("id_user"));
                cl.setNameuser(rs.getString("name_user"));
                cl.setPassword(rs.getString("pass_user"));

                UsuarioList.add(cl);
            }
        }
        finally
        {
            ps.close();
            con.close();
            System.out.println("print carga desde  el dao");
        }

        return UsuarioList;
    }

    @Override
    public void validarlogin(String name, String pass) throws SQLException {
        // TODO Auto-generated method stub

        //ManagerController mn = new ManagerController();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String verificarlogin ="select count (1) from usuario where name_user ='"+name+"' and  pass_user ='"+pass+"'";
        System.out.println("verificando string verigicarlogin");

        
        try {
            con =  ManagerController.obtenerConexion();
            ps = con.prepareStatement("select count (1) from usuario where name_user ='"+name+"' and  pass_user ='"+pass+"'");
            rs = ps.executeQuery();
            
            while (rs.next()){
                if(rs.getInt(1)==1){
                    System.out.println("Bienvendio");
                    Main.MainVista mv = new Main.MainVista();
                    mv.checkLogin("/Vista/frmPrincipal2.fxml"); 
                }
                else{
                    System.out.println("Login invalido");
                }
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }


}