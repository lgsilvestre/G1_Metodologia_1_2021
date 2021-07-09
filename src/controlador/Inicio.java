package controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import modelo.datosMedea;

/**
 *
 * @author josec
 */
public class Inicio extends Application {
    
    ProgressBar bar;
    Stage stage;
    
    static datosMedea modelos;

    
    private Scene createPreloaderScene() throws IOException{
        Parent root = FXMLLoader.load(Inicio.class.getResource("/vista/ventanaReproductor.fxml"));
        return new Scene(root); 
    } 
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setScene(createPreloaderScene());        
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelos = new datosMedea();
        launch(args);
    }
    
    
}
