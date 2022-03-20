package Conexion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageInputStream;

import Entidad.Heroes;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;

public class HeroesDAO implements iHeroesDAO{



    @Override   //CREATE
    public void insertar(Heroes heroes) throws SQLException, FileNotFoundException {
            // TODO Auto-generated method stub
            Connection conn = null;
            PreparedStatement ps = null;

            File file = heroes.getFileurl();
            try
            {
                conn = ManagerController.obtenerConexion();


                FileChooser files = new FileChooser();  
                files.setTitle("Save Image");  
                
                File file1 = file;
                FileInputStream fis = new FileInputStream("");


                
                ps = conn.prepareStatement("insert into newheroesp (id,nombre,foto,alterego,fecha,nemesis) values(?,?,?,?,?)");
    
                ps.setInt(1, heroes.getId());
                ps.setString(2, heroes.getNombre());
                ps.setBinaryStream(3, fis, file1.length());
                ps.setString(4,heroes.getAlterego());
                ps.setString(5,heroes.getFecha());
                ps.setString(6,heroes.getNemesis());
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Heroe insertado Correctamente");
            alert.showAndWait();
               
    
                ps.executeUpdate();
            }
            finally
            {
                ps.close();
                conn.close();
            }
        
    }

    @Override   //UPTADE
    public void actualizar(Heroes heroes) throws SQLException, FileNotFoundException, IOException {
        Connection con= null;
        PreparedStatement ps  =  null;
        try{
        con = ManagerController.obtenerConexion();
       
        ps  = con.prepareStatement("UPDATE newheroesp SET name = ?, alterego = ?, fecha = ?, nemesis = ?  WHERE id = ?");
        
       
        ps.setString(1,heroes.getNombre());
       	ps.setString(2, heroes.getAlterego());
        ps.setString(3, heroes.getFecha());
        ps.setString(4, heroes.getNemesis());
        ps.setInt(5, heroes.getId());
        

        ps.executeUpdate();
        System.out.println("Se actualizó con exito");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Heroe Actualizado Correctamente");
            alert.showAndWait();
        
        }
        finally{
            con.close();
            ps.close();

        }
        
    }

    @Override   //DELETE
    public void eliminar(int codigo) throws SQLException {
        // TODO Auto-generated method stub
        Connection con = null;
        PreparedStatement ps = null;

        try
        {
            con = ManagerController.obtenerConexion();
		ps.setInt(1, codigo);
            ps = con.prepareStatement("DELETE FROM  newheroesp WHERE id = ?");

            

            ps.executeUpdate();
            System.out.print("se elimino con exito");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Heroe Eliminado Correctamente");
            alert.showAndWait();

        }
        finally
        {
            ps.close();
            con.close();
        }
        
    }

    @Override    //READ
    public List<Heroes> consultartodo() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Heroes> HeroesList = new ArrayList<>();
        Heroes h= null;

        try
        {
            con =  ManagerController.obtenerConexion();
            ps = con.prepareStatement("SELECT * FROM newheroesp");

            rs = ps.executeQuery();

            while(rs.next())
            {
                h = new Heroes();
                h.setId(rs.getInt("id"));
                h.setNombre(rs.getString("name"));
                h.setLoadFile(rs.getBytes("foto"));
                h.setAlterego(rs.getString("alterego"));
                h.setFecha(rs.getString("fecha"));
                h.setNemesis(rs.getString("nemesis"));
                HeroesList.add(h);
                
            }
        }
        finally
        {
            ps.close();
            con.close();
            //System.out.println("consultando satisfactoriamente");
        }

        return HeroesList;
    }


    
    
    @Override
    public Heroes consultarheroe(Heroes heroe) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
       
        Heroes h = null;

        try
        {
            con =  ManagerController.obtenerConexion();
            ps = con.prepareStatement("SELECT * FROM newheroesp where id=?");
            
            rs = ps.executeQuery();

            while(rs.next())
            {
                h = new Heroes();
                h.setId(rs.getInt("id"));
                h.setNombre(rs.getString("nombre"));
                h.setLoadFile(rs.getBytes("foto"));
                h.setAlterego(rs.getString("alterego"));
                h.setFecha(rs.getString("fecha"));
                h.setNemesis(rs.getString("nemesis"));
            }
        }
        finally
        {
            ps.close();
            con.close();
            System.out.println("consultando satisfactoriamente");
        }

        return h;

        
    }

    @Override
    public List<Heroes> consultarfiltro(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    
        }