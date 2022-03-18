package Controladores;

import java.io.IOException;


import Main.MainVista;


import javafx.fxml.FXML;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ItemController {

    @FXML
    private ImageView img;



    @FXML
    private void click(MouseEvent event) throws IOException {
        MainVista mv = new MainVista();
        mv.checkLogin("/Vista/frmEditor.fxml");
        img.accessibleHelpProperty();

    }



}
