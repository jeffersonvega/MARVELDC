package Controladores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.imageio.stream.FileImageInputStream;

import Conexion.HeroesDAO;
import Conexion.iHeroesDAO;
import Entidad.Heroes;
import Main.MainVista;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class EditorSaveController implements Initializable {
    @FXML
    private Label lblRuta;
    @FXML
    private TextField txtSHeroName;

    @FXML
    private ComboBox<?> cmbEditor;
    @FXML
    private TextField txtAlterEgo;

    @FXML
    private TextField txtPrimeraPublicacion;

    @FXML
    private TextField txtPersonajes;
    @FXML
    private Button btnAbrir;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnCerrar;
    
    @FXML
    private Button btnGuardar;
    @FXML
    private ImageView imgHeroCargado;
    
    String StringURL;
    File fileurl;

    @FXML
    void actGuardar(ActionEvent event) throws FileNotFoundException, SQLException, IOException {
        iHeroesDAO pDao = new HeroesDAO();
        //guardar datos
        Heroes h = new Heroes();
        h.setNombre(txtSHeroName.getText());
        h.setFileurl(fileurl);
        h.setAlterego(txtAlterEgo.getText());
        h.setFecha(txtPrimeraPublicacion.getText());
        h.setNemesis(txtPersonajes.getText());
//insert de datos desde el dao
        pDao.insertar(h);

    }
    @FXML
    void actAbrir(ActionEvent event) throws FileNotFoundException, SQLException, IOException {

	//se usa  un file chooser para abrir la ubicacion y buscar elheroe correspondiente
        FileChooser file = new FileChooser();  
        file.setTitle("Save Image");  
        File file1 = file.showOpenDialog(null);
        System.out.println(file1);  
        lblRuta.setVisible(true);
        fileurl  = file1.getParentFile(); 
        lblRuta.setText(StringURL);  
        obtenerurl(file1); 
        Image image = new Image(StringURL);
        imgHeroCargado.setImage(image);

        
    }
    public  File obtenerurl(File a){
            fileurl =a;
            return a;
    }
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
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        lblRuta.setVisible(false);
	if(lblruta=null){
	lblRuta.setVisible(false
}

        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("MARVEL","DC");
        
    }

}