package controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

/**
 *
 * @author josec
 */
public class Inicio extends Application {

    ProgressBar bar;
    Stage stage;

    
    private Scene createPreloaderScene() throws IOException{
        System.out.println("1");
        Parent root = FXMLLoader.load(Inicio.class.getResource("/vista/FXML.fxml"));
        return new Scene(root, 950, 705); 
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
        launch(args);
    }
    
    
}
