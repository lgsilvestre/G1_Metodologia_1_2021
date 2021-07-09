/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author josec
 */
public class ventanaResproductorController implements Initializable {
    public String NOMBRE_ARCHIVO = "Raiden Rap Shuumatsu no Valkyrie.mp4";
    Media video;
    MediaPlayer mediaPlayer;
    
    boolean play;
    
    @FXML
    private MediaView ventanaMultiMedia;
    @FXML
    private Slider volumen;
    @FXML
    private Slider slider_tiempo;
    @FXML
    private Button PlayPause;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            File archivo = new File(NOMBRE_ARCHIVO);
            video = new Media(archivo.toURI().toString());
            mediaPlayer = new MediaPlayer(video);
            ventanaMultiMedia.setMediaPlayer(mediaPlayer);
            mediaPlayer.setOnReady(() -> {
                slider_tiempo.setMax(mediaPlayer.getTotalDuration().toSeconds());
                slider_tiempo.valueProperty().addListener((p, o, value) -> {
                    if (slider_tiempo.isPressed()) {
                        mediaPlayer.seek(Duration.seconds(value.doubleValue()));
                    }
            });
            mediaPlayer.currentTimeProperty().addListener((p, o, value) -> {
                slider_tiempo.setValue(value.toSeconds());
            });
        });
            play=true;
            mediaPlayer.setAutoPlay(true);
            PlayPause.setText("Pause");
            volumen.setValue(0.60);
            mediaPlayer.volumeProperty().bindBidirectional(volumen.valueProperty());
    }    

    @FXML
    private void PlayPause(ActionEvent event) {
        if(play){
            mediaPlayer.pause();
            PlayPause.setText("Play");
            play=!play;
        }
        else{
            mediaPlayer.play();
            PlayPause.setText("Pause");
            play=!play;
        }
    }

    @FXML
    private void Stop(ActionEvent event) {
        mediaPlayer.stop();
        PlayPause.setText("Play");
        play=!play;
    }

}
