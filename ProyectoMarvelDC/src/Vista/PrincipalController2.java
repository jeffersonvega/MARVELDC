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
            personaje.setNombre("mrmajestic");
            personaje.setImgsrc("/utilidadheroes/mr_majestic.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("namor");
            personaje.setImgsrc("/utilidadheroes/namor.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("nightwing");
            personaje.setImgsrc("/utilidadheroes/nightwing.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("ojodehalcon");
            personaje.setImgsrc("/utilidadheroes/ojo_de_halcon.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("oroderefuerzo");
            personaje.setImgsrc("/utilidadheroes/oro_de_refuerzo.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("pasillodehank");
            personaje.setImgsrc("/utilidadheroes/pasillo_de_hank.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("picara");
            personaje.setImgsrc("/utilidadheroes/picara.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("powergirl");
            personaje.setImgsrc("/utilidadheroes/power_girl.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("psylocke");
            personaje.setImgsrc("/utilidadheroes/psylocke.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("punisher");
            personaje.setImgsrc("/utilidadheroes/punisher.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("raven");
            personaje.setImgsrc("/utilidadheroes/raven.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("redtornado");
            personaje.setImgsrc("/utilidadheroes/red_tornado.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("sandman");
            personaje.setImgsrc("/utilidadheroes/sandman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("sheHulk");
            personaje.setImgsrc("/utilidadheroes/she_Hulk.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("sif");
            personaje.setImgsrc("/utilidadheroes/sif.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("silkspectre");
            personaje.setImgsrc("/utilidadheroes/silk_spectre.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("spiderwoman");
            personaje.setImgsrc("/utilidadheroes/spider_woman.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("spiderman");
            personaje.setImgsrc("/utilidadheroes/spiderman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("spiral");
            personaje.setImgsrc("/utilidadheroes/spiral.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("starfire");
            personaje.setImgsrc("/utilidadheroes/starfire.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("stargirl");
            personaje.setImgsrc("/utilidadheroes/stargirl.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("staticshock");
            personaje.setImgsrc("/utilidadheroes/static_shock.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("superman");
            personaje.setImgsrc("/utilidadheroes/superman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("swampthing");
            personaje.setImgsrc("/utilidadheroes/swamp_thing.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("tedkord");
            personaje.setImgsrc("/utilidadheroes/ted_kord.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("theflash");
            personaje.setImgsrc("/utilidadheroes/the_flash.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("thor");
            personaje.setImgsrc("/utilidadheroes/thor.jpg");
            personajes.add(personaje);
 
            personaje = new Personajes();
            personaje.setNombre("thundra");
            personaje.setImgsrc("/utilidadheroes/thundra.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("tigra");
            personaje.setImgsrc("/utilidadheroes/tigra.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("tormenta");
            personaje.setImgsrc("/utilidadheroes/tormenta.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("vision");
            personaje.setImgsrc("/utilidadheroes/vision.png");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("viudanegra");
            personaje.setImgsrc("/utilidadheroes/viuda_negra.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("wonderwoman");
            personaje.setImgsrc("/utilidadheroes/wonder_woman.jpg");
            personajes.add(personaje);

            personaje = new Personajes();
            personaje.setNombre("zatanna");
            personaje.setImgsrc("/utilidadheroes/zatanna.jpg");
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
