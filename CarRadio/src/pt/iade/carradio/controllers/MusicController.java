package pt.iade.carradio.controllers;

import java.sql.Time;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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
import pt.iade.carradio.models.daos.MusicDAO;
import pt.iade.carradio.models.daos.PlaylistDAO;

/**
 * Classe que mostra os dados obtidos na {@link pt.iade.carradio.models.daos.MusicDAO} e {@link pt.iade.carradio.models.daos.PlaylistDAO}.
 * @author ricardo.joaquim
 * @author bruno.flores
 */

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
    
    /**
     * Voltar ao menu principal
     */
    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openPlaylistWindow();
    }
    
    
 	private ObservableList<Music> songs = MusicDAO.getSongs(PlaylistController.getPlaylistClicked());
 	
 	
    private String nomeMusica1 = MusicDAO.getNomeMusica1(PlaylistController.getPlaylistClicked());
	private String nomeArtista1 = MusicDAO.getNomeArtista1(PlaylistController.getPlaylistClicked());
	private String imagem1  = MusicDAO.getImagem1(PlaylistController.getPlaylistClicked());
	private String nomePlaylist1 = PlaylistDAO.getPlaylistChosen(PlaylistController.getPlaylistClicked());
	
	
	/**
	 * Método que preenche a tabela e as labels com os dados obtidos.
	 */
	@FXML
    private void initialize() {
    	columnMusic.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeMusica()));
    	columnDuration.setCellValueFactory(new PropertyValueFactory<Music, Time>("Duracao"));
    	musicTable.setItems(songs);
    	musicName.setText(nomeMusica1);
    	artistaName.setText(nomeArtista1);
    	playlistName.setText(nomePlaylist1);
    	
    	Image img = new Image(Main.class.getResource(imagem1).toString());
    	musicImage.setImage(img);

    	musicTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    	    if (newSelection != null) {
    	        musicName.setText(newSelection.getNomeMusica());
    	        artistaName.setText(newSelection.getNomeArtista());
    	        durationTime.setText(newSelection.toStringDuracao());
    	        Image imagem = new Image(Main.class.getResource(newSelection.getLinkImagem()).toString());
    	        musicImage.setImage(imagem);
    	        }
    	    }
);
	}
    	int songID;
    	
    /**
     * Método que avança para a música seguinte.	
     * @param event
     */
        @FXML
        void nextMusic(MouseEvent event) {
        	for (int songID = 0; songID < 10; songID++) {
            	nomeMusica1 = MusicDAO.getNomeMusica1(songID);
            	musicName.setText(nomeMusica1);
            	nomeArtista1 = MusicDAO.getNomeArtista1(songID);
            	artistaName.setText(nomeArtista1);
			}
        	
        }

    Image pause = new Image(getClass().getResource("../images/pause.png").toExternalForm());
    Image play = new Image(getClass().getResource("../images/play.png").toExternalForm());
    boolean playing=true;
    /**
     * Método que altera a imagem de Play para Pause.
     * @param event
     */
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


