/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author josec
 */
public class FXMLController implements Initializable {
    public String NOMBRE_ARCHIVO = "Raiden Rap Shuumatsu no Valkyrie.mp4";
    Media video;
    MediaPlayer mediaPlayer;
    
    @FXML
    private MediaView ventanaMultiMedia;
    @FXML
    private Slider volumen;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            File archivo = new File(NOMBRE_ARCHIVO);
            video = new Media(archivo.toURI().toString());
            mediaPlayer = new MediaPlayer(video);
            ventanaMultiMedia.setMediaPlayer(mediaPlayer);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.volumeProperty().bindBidirectional(volumen.valueProperty());
    }    

    @FXML
    private void Play(ActionEvent event) {
        System.out.println("play");
        mediaPlayer.play();
    }

    @FXML
    private void Pause(ActionEvent event) {
        System.out.println("pause");
        mediaPlayer.pause();
    }    

    @FXML
    private void Stop(ActionEvent event) {
        System.out.println("Stop");
        mediaPlayer.stop();
    }
}
