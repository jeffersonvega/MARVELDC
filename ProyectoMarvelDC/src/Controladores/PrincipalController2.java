package Controladores;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
 
import java.sql.SQLException;
 
import java.util.List;
import java.util.ResourceBundle;

import Conexion.HeroesDAO;
import Conexion.iHeroesDAO;
import Entidad.Heroes;

import Main.MainVista;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PrincipalController2 implements Initializable {
    PrincipalController2 Principalcontroller2;

    @FXML
    private Button btnCerrar;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnEditor;

    @FXML
    private TextField txtUser;
    @FXML
    private TextField txtId;

    @FXML
    void actCerrar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private ScrollPane scrollpane;

    @FXML
    private AnchorPane AnchorPane1;

    @FXML
    private GridPane gridpane;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnAñadir;

    List<Heroes> datos;
    iHeroesDAO pDao = new HeroesDAO();

    

    @FXML
    void actAñadir(ActionEvent event) throws IOException {
        MainVista mv = new MainVista();
        mv.checkLogin("/Vista/frmEditorSave.fxml");

    }

    Image urlimagen;

    public Image insertarimagen() {

        FileChooser file = new FileChooser();
        file.setTitle("Save Image");
        File file1 = file.showOpenDialog(null);
        String url = file1.getAbsolutePath();
        System.out.println(url);

        Image image = new Image(url);

        return image;

    }

    Image flo = null;
    ImageView imagenx;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        consultar();

        txtUser.textProperty().addListener((observable, oldtxt, newtext) -> {
            filtro(newtext);
        });

    }

    public void consultar() {
        AnchorPane ap = new AnchorPane();
        iHeroesDAO pDao = new HeroesDAO();

        gridpane.setPadding(new Insets(20, 20, 20, 20));
        gridpane.setHgap(20);
        gridpane.setVgap(20);
        gridpane.getChildren().clear();
        int fila = 0;
        int columna = 0;
        
        try {
            datos = pDao.consultartodo();
            for (Heroes heroe : datos) {
                ByteArrayInputStream bai = new ByteArrayInputStream(heroe.getLoadFile());
                bai.equals(fila>=4);
                ap.getChildren().add(imagenx);
                gridpane.add(imagenx, columna, fila);
                iraleditor(heroe);
                columna++;
                if (columna > 4) {
                    columna = 0;
                    fila++;
                }

                

            }
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public void filtro(String name) {
        AnchorPane ap = new AnchorPane();
        iHeroesDAO pDao = new HeroesDAO();
//setienado imagenes def top
        gridpane.setPadding(new Insets(20, 10, 20, 10));
        gridpane.setHgap(20);
        gridpane.setVgap(10);
        gridpane.getChildren().clear();

        int fila = 0;
        int columna = 0;

        datos = pDao.consultarfiltro(name);
        //montando imagenes
        for (Heroes heroe : datos) {
            ByteArrayInputStream bai = new ByteArrayInputStream(heroe.getLoadFile());
            Image flo = new Image(bai, 200, 150, true, false);
            new ImageView(flo);
            imagenx = new ImageView(flo);
            
            ap.getChildren().add(imagenx);
            gridpane.add(imagenx, columna, fila);
            iraleditor(heroe);

            columna++;
            if (columna > 4) {
                columna = 0;
                fila++;
            }

        }
    } 

    public void iraleditor(Heroes heroes) {

        imagenx.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            //event.consume();
            try {
                llamarfrmeditor(heroes);
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    public void recibirid(String id) {
        //recibiendo el id para obtener la foto y sus datos al sgt frm

        txtId.setText(id);

    }

    private void llamarfrmeditor(Heroes heroes) throws IOException {
        //metodo para llamar al editor mediante click
        Stage stage2 = new Stage();
        //llamando al editor mendiante click
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/frmEditor.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage2.setScene(scene);
        stage2.alwaysOnTopProperty();
        stage2.eventDispatcherProperty();
        stage2.forceIntegerRenderScaleProperty();
        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.showAndWait();

    }

}
