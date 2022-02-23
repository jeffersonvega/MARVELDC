package Vista;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.sound.sampled.SourceDataLine;

import Entidad.Personajes;
import Main.MyListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class PrincipalController2 implements Initializable {

    @FXML
    private Button btnCerrar;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnEditor;

    @FXML
    private TextField txtUser;

    

    @FXML
    void actBuscar(ActionEvent event) {

    }

    @FXML
    void actCerrar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void actEditor(ActionEvent event) throws IOException {
        MainVista mv = new MainVista();
        mv.checkLogin("/Vista/frmEditor.fxml");
    }

    @FXML
    private ScrollPane scrollpane;
    
    @FXML
    private AnchorPane AnchorPane1;

    @FXML
    private GridPane gridpane;

    private Image image;

    private List<Personajes> personajes = new ArrayList<>();


    private List<Personajes> getdata() {
        List<Personajes> personajes = new ArrayList<>();
        Personajes personaje;
     
            personaje = new Personajes();
            personaje.setNombre("stargirl");
            personaje.setImgsrc("/utilidadheroes/stargirl.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("ala nocturna");
            personaje.setImgsrc("/utilidadheroes/ala-nocturna.jpg");
            personajes.add(personaje);
            
            personaje = new Personajes();
            personaje.setNombre("apollo");
            personaje.setImgsrc("/utilidadheroes/apollo.jpg");
            personajes.add(personaje);


            personaje = new Personajes();
            personaje.setNombre("aquaman");
            personaje.setImgsrc("/utilidadheroes/aquaman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("atomo");
            personaje.setImgsrc("/utilidadheroes/atomo.jpg");
            personajes.add(personaje);
            
            personaje = new Personajes();
            personaje.setNombre("batman");
            personaje.setImgsrc("/utilidadheroes/batman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("batwoman");
            personaje.setImgsrc("/utilidadheroes/batwoman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("big barda");
            personaje.setImgsrc("/utilidadheroes/big_barda.jpg");
            personajes.add(personaje);
            
            personaje = new Personajes();
            personaje.setNombre("bishop");
            personaje.setImgsrc("/utilidadheroes/bishop.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("black canary");
            personaje.setImgsrc("/utilidadheroes/black_canary.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("black cat");
            personaje.setImgsrc("/utilidadheroes/black_cat.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("blue beetle");
            personaje.setImgsrc("/utilidadheroes/blue_beetle.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("buho nocturno");
            personaje.setImgsrc("/utilidadheroes/buho_nocturno.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("cable");
            personaje.setImgsrc("/utilidadheroes/cable.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("capitan america");
            personaje.setImgsrc("/utilidadheroes/capitan_america.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("catwoman");
            personaje.setImgsrc("/utilidadheroes/catwoman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("centinela omega");
            personaje.setImgsrc("/utilidadheroes/centinela_omega.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("ciclope");
            personaje.setImgsrc("/utilidadheroes/ciclope.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("colossus");
            personaje.setImgsrc("/utilidadheroes/colossus.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("cyborg");
            personaje.setImgsrc("/utilidadheroes/cyborg.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("daredevil");
            personaje.setImgsrc("/utilidadheroes/daredevil.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("deadpool");
            personaje.setImgsrc("/utilidadheroes/deadpool.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("dick grayson");
            personaje.setImgsrc("/utilidadheroes/dick_grayson.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("doctor strange");
            personaje.setImgsrc("/utilidadheroes/doctor_strange.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("domino");
            personaje.setImgsrc("/utilidadheroes/domino.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("don hall");
            personaje.setImgsrc("/utilidadheroes/don_hall.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("donna troy");
            personaje.setImgsrc("/utilidadheroes/donna_troy.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("elektra");
            personaje.setImgsrc("/utilidadheroes/elektra.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("etrigan");
            personaje.setImgsrc("/utilidadheroes/etrigan.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("falcon");
            personaje.setImgsrc("/utilidadheroes/falcon.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("fantomex");
            personaje.setImgsrc("/utilidadheroes/fantomex.png");
            personajes.add(personaje);

            return personajes;
    }

    private void elegirPersonaje(Personajes personaje){
        image = new Image(getClass().getResourceAsStream(personaje.getImgsrc()));
    }

    private void imagenes(String filter) {
        int  columna=0;
        int  fila=1;     
        try {   
            gridpane.getChildren().clear();
            for (int i = 0; i < personajes.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/Vista/frmItems.fxml"));
    
                AnchorPane anchorPane = fxmlLoader.load();
                
                ItemController itemController = fxmlLoader.getController();

                if (personajes.get(i).getNombre().contains(filter)) {
                    itemController.setData(personajes.get(i));
                    if (i>0) {
                        columna++;
                    }
                } else {
                    if (filter.isEmpty
                    ()) {
                        itemController.setData(personajes.get(i));
                        if (i>0) {
                            columna++;
                        }
                    }
                }   

                if (columna==4){
                    columna=0;
                    fila++;
                }
               
                gridpane.add(anchorPane,columna,fila);
                GridPane.setMargin(anchorPane, new Insets(10));
            }


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        txtUser.textProperty().addListener((observable, oldtxt, newtext)->{
            imagenes(newtext);
         });
         
        personajes.addAll(getdata());

       /*  if(personajes.size()>0){
            elegirPersonaje(personajes.get(0));
        } */

        imagenes("");

    }

    
}
