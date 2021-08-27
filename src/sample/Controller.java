package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;


public class Controller implements Initializable {
    private File dir;
    private File[] files;
    private ArrayList<File> songs;
    private int songNumber;
    private Timer timer;
    private TimerTask task;
    private boolean running;

    private Label songLabel;
    private ProgressBar songProgressBar;
    private Button playBTN;
    private Button pauseBTN;
    private Button rewBTN;
    private Button ffwBTN;
    private Button resetBTN;
    private Slider volumeSlider;

    public void playMedia(ActionEvent actionEvent) {
    }

    public void pauseMedia(ActionEvent actionEvent) {
    }

    public void rewriteMedia(ActionEvent actionEvent) {
    }

    public void forwardMedia(ActionEvent actionEvent) {
    }

    public void resetMedia(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            songs = new ArrayList<File>();
            dir = new File();
    }

    public void beginTimer(){

    }
    public void cancelTimer(){

    }
}
