package pt.iade.carradio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import pt.iade.carradio.WindowManager;

public class MusicController {

    @FXML
    private Label playlistName;

    @FXML
    private TableView<?> musicTable;

    @FXML
    private TableColumn<?, ?> musicData;

    @FXML
    private TableColumn<?, ?> durationData;

    @FXML
    private ImageView musicImage;

    @FXML
    private Label musicName;

    @FXML
    private Label artistaName;

    @FXML
    private HBox player;
    

    @FXML
    void nextMusic(MouseEvent event) {

    }

    @FXML
    void playButton(MouseEvent event) {

    }

    @FXML
    void previousMusic(MouseEvent event) {

    }

    @FXML
    void shuffle(MouseEvent event) {

    }

    @FXML
    void volume(MouseEvent event) {

    }
    @FXML
    void onHomeButton(MouseEvent event) {

    }
}

