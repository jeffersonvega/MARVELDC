package Vista;

import java.io.IOException;

import Conexion.ManagerController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainVista extends Application{
    private double xOffset =0;
    private double yOffset =0;
    private static Stage stage;
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub  
        stage = primaryStage;
        Parent root =  FXMLLoader.load(getClass().getResource("/Vista/frmLogin2.fxml"));
        primaryStage.initStyle(StageStyle.DECORATED.UNDECORATED);
        //comentario
        System.out.println("hola");
        root.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                // TODO Auto-generated method stub
                xOffset = arg0.getSceneX();
                yOffset = arg0.getSceneY();
                
            }
            
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                // TODO Auto-generated method stub
                stage.setX(arg0.getScreenX() - xOffset);
                stage.setY(arg0.getScreenY() - yOffset);
                
            }
            
        });

        primaryStage.setTitle("Proyecto PAG!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
       
    }
    public void checkLogin(String fxml) throws IOException{
        Parent root =  FXMLLoader.load(getClass().getResource(fxml));
        
        stage.getScene().setRoot(root);




    }
    public static void main(String[] args) {
        launch(args);
    }
}
