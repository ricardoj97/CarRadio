package pt.iade.carradio.controllers;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import pt.iade.carradio.Main;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.models.Playlist;
import pt.iade.carradio.models.daos.MusicDAO;
import pt.iade.carradio.models.daos.PlaylistDAO;

public class MusicController {

    @FXML
    private Label playlistName, musicName, artistaName, musicTime, durationTime;

    @FXML
    private TableView<Music> musicTable;

    @FXML
    private TableColumn<Music, String> columnMusic;

    @FXML
    private TableColumn<Music, Time> columnDuration;

    @FXML
    private ImageView musicImage;

    @FXML
    private HBox player;

    @FXML
    private Slider musicSlider;

    @FXML
    private ImageView playButton;
    
    //Voltar ao menu principal
    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openPlaylistWindow();
    }
    
    private int playlistID = 2;
 	private ObservableList<Music> songs = MusicDAO.getSongs(playlistID);
 	
    private String nomeMusica1 = MusicDAO.getNomeMusica1(playlistID);
	private String nomeArtista1 = MusicDAO.getNomeArtista1(playlistID);
	private String imagem1  = MusicDAO.getImagem1(playlistID);
	//private ObservableList<Playlist> playlists = PlaylistDAO.getPlaylists(playlistID);
	
	
	@FXML
    private void initialize() {
	//	playlistName.setText(nomePlaylist);
    	columnMusic.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeMusica()));
    	columnDuration.setCellValueFactory(new PropertyValueFactory<Music, Time>("Duracao"));
    	musicTable.setItems(songs);
    	musicName.setText(nomeMusica1);
    	artistaName.setText(nomeArtista1);
    	
    	//Image imagem = new Image(getClass().getResource(imagem1).toExternalForm());
    	//musicImage.setImage(imagem);
    	
    	
    	
    	musicTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    	    if (newSelection != null) {
    	    	
    	        musicName.setText(newSelection.getNomeMusica());
    	        artistaName.setText(newSelection.getNomeArtista());
    	        durationTime.setText(newSelection.toStringDuracao());
    	        //Image imagem = new Image(Main.class.getResource(newSelection.getLinkImagem()).toString());
    	        //musicImage.setImage(imagem);
    	        }
    	    }
);
	}
    	       



	
	// SLIDER MÚSICA

	
//	inputText.focusedProperty().addListener((obs, o, n)->{
//		if(!n.booleanValue()){
//			inputText.setText(String.valueOf((int)musicSlider.getValue()));
//		}
//	});
//	
//	musicSlider.valueProperty().addListener((obs, o, n)->{
//		inputText.setText(String.valueOf((int)musicSlider.getValue()));
//	});    
//
//	 
	
    	int songID;
    	
        @FXML
        void nextMusic(MouseEvent event) {
        	songID= songID+1;
        	nomeMusica1 = MusicDAO.getNomeMusica1(songID);
        	musicName.setText(nomeMusica1);
        	nomeArtista1 = MusicDAO.getNomeArtista1(songID);
        	artistaName.setText(nomeArtista1);
        	System.out.println(songID);
        	
        }

    Image pause = new Image(getClass().getResource("../images/pause.png").toExternalForm());
    Image play = new Image(getClass().getResource("../images/play.png").toExternalForm());
    boolean playing=true;
    
    @FXML
    void playButton(MouseEvent event) {
    	if(playing) {
    		playButton.setImage(pause);
    		playing=false;
    	}
    	else {
    		playButton.setImage(play);
    		playing=true;
    	}	
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

}

