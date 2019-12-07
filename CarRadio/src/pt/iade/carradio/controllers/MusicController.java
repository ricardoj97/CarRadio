package pt.iade.carradio.controllers;

import java.sql.Time;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.models.daos.MusicDAO;

public class MusicController {

    @FXML
    private Label playlistName;

    @FXML
    private TableView<Music> musicTable;

    @FXML
    private TableColumn<Music, String> columnMusic;

    @FXML
    private TableColumn<Music, Time> columnDuration;

    @FXML
    private ImageView musicImage;

    @FXML
    private Label musicName;

    @FXML
    private Label artistaName;

    @FXML
    private HBox player;

    
	private ObservableList<Music> songs = MusicDAO.getSongs();
    
	@FXML
    private void initialize() {
    	columnMusic.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeMusica()));
    	columnDuration.setCellValueFactory(new PropertyValueFactory<Music, Time>("duracao"));
    	musicTable.setItems(songs);
			   
    }
    
    
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

