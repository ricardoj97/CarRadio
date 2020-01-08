package pt.iade.carradio.controllers;

import java.sql.Time;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.models.daos.MusicDAO;

public class GenreController {


    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openPlaylistWindow();
    }
    
    @FXML
    void onUser(MouseEvent event) {
    	WindowManager.openUserWindow();
    }
    
    @FXML
    private TableView<Music> musicTableByGenre;
    
    @FXML
    private TableColumn<Music, String> columnMusic;

    @FXML
    private TableColumn<Music, String> columnArtist;

    @FXML
    private TableColumn<Music, Time> columnDuration;

    private static int genreClicked = 0;
    
    public static int getGenreClicked() {
		return genreClicked;
	}
    
    @FXML
    void BtnHipHop(MouseEvent event) {
    	genreClicked=1;
    	WindowManager.openSongsWindow();
    }
    @FXML
    void BtnRock(MouseEvent event) {
    	genreClicked=2;
    	WindowManager.openSongsWindow();
    }
    @FXML
    void BtnEletronica(MouseEvent event) {
    	genreClicked=3;
    	WindowManager.openSongsWindow();
    }

    @FXML
    void BtnFunk(MouseEvent event) {
    	genreClicked=4;
    	WindowManager.openSongsWindow();
    }

    @FXML
    void BtnPop(MouseEvent event) {
    	genreClicked=5;
    	WindowManager.openSongsWindow();
    }

    @FXML
    void BtnPunk(MouseEvent event) {
    	genreClicked=6;
    	WindowManager.openSongsWindow();
    }

    @FXML
    void BtnRB(MouseEvent event) {
    	genreClicked=7;
    	WindowManager.openSongsWindow();
    }

    
    
 	private ObservableList<Music> songsG = MusicDAO.getSongsByGenre(genreClicked);
 	        
 	
    @FXML
    private void initialize() {
	columnMusic.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeMusica()));
	columnArtist.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeArtista()));
	columnDuration.setCellValueFactory(new PropertyValueFactory<Music, Time>("Duracao"));
	musicTableByGenre.setItems(songsG);
    }

}
