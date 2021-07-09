/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizar;

import java.awt.Color;
import static java.awt.Color.BLACK;
import java.io.File;
import java.io.IOException;
import javafx.stage.Stage;            
import javafx.scene.Group;             
import javafx.scene.Scene;          
import javafx.application.Application;
import javafx.scene.control.Button;  
import javafx.scene.image.ImageView;
import javafx.application.Application;
import static javafx.application.Application.launch;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;

/**
 *
 * @author Cucho
 */
public class JavaFXApplication1 extends Application {
    Stage stage;
    
    private Scene createPreloaderScene() throws IOException{
        Parent root = FXMLLoader.load(JavaFXApplication1.class.getResource("Contenido.FXML.fxml"));
        return new Scene(root, 1000, 500); 
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        
        stage.setScene(createPreloaderScene());        
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}