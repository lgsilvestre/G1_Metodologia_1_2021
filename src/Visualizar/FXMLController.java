package Visualizar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
/**
 *
 * @author Cucho
 */
public class FXMLController implements Initializable {

    @FXML
    public void Series(ActionEvent e) {
        System.out.println("series");
    }
    
    @FXML
    public void Peliculas(ActionEvent e) {
        System.out.println("peliculas");
    }
    
    @FXML
    public void Musica(ActionEvent e) {
        System.out.println("musica");
    }
    
    @FXML
    public void Documentales(ActionEvent e) {
        System.out.println("documentales");
    }
    
    @FXML
    public void porVer(ActionEvent e) {
        System.out.println("por ver");
    }
    
    @FXML
    public void Recientes(ActionEvent e) {
        System.out.println("recientes");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}