package Controladores;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Conexion.HeroesDAO;
import Conexion.iHeroesDAO;
import Entidad.Heroes;
import Main.MainVista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class EditorController implements Initializable {
   // PrincipalController2 stage1contollerstage2;
   @FXML
    private Button btnGuardar;

    @FXML
    private Button btnEliminar;

    @FXML
    void actEliminar(ActionEvent event) throws NumberFormatException, SQLException {
        iHeroesDAO pDaos = new HeroesDAO();
        
        pDaos.eliminar(Integer.parseInt(txtIdEditor.getText()));
    }

    @FXML
    void actGuardar(ActionEvent event, AlertType arg0) throws FileNotFoundException, SQLException, IOException {
        iHeroesDAO pDao = new HeroesDAO();
        
        Heroes h = new Heroes();
        h.setId(Integer.parseInt(txtIdEditor.getText()));
        h.setNombre(txtname.getText());
        h.setAlterego(txtNemesis.getText());
        h.setFecha(txtfecha.getText());
        h.setNemesis(txtNemesis.getText());
  
   

        pDao.actualizar(h);
        Alert alert=new Alert(arg0);
        alert.show();

    }
    @FXML
    private TextField txtNemesis;

    @FXML
    private TextField txtalterego;

    @FXML
    private TextField txtfecha;

    @FXML
    private ImageView img;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnCerrar;
    @FXML
    private TextField txtIdEditor;
    @FXML
    private TextField txtname;

    private EditorController stage1contollerstage2;
    @FXML
    void actCerrar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void actRegresar(ActionEvent event) throws IOException {
         MainVista mv = new MainVista();
         mv.checkLogin("/Vista/frmPrincipal2.fxml");
        
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        stage1contollerstage2.recibirids(txtIdEditor.getText(), null);
        

        
    }

    private void recibirids(String text, Heroes heroes) {
        txtIdEditor.setText(String.valueOf(heroes.getId()));
        txtname.setText(heroes.getNombre());
        txtalterego.setText(heroes.getAlterego());
        txtfecha.setText(heroes.getFecha());
        txtNemesis.setText(heroes.getNemesis());
        txtIdEditor.setEditable(false);

    }

    public void recibirid(Heroes heroes) {
        txtIdEditor.setText(String.valueOf(heroes.getId()));
        txtname.setText(heroes.getNombre());
        txtalterego.setText(heroes.getAlterego());
        txtfecha.setText(heroes.getFecha());
        txtNemesis.setText(heroes.getNemesis());
        txtIdEditor.setEditable(false);

        

    }

}
