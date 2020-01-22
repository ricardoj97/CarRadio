package pt.iade.carradio.controllers;

import java.sql.Time;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.models.daos.MusicDAO;

/**
 * Classe que controla os géneros. Vai buscar os dados obtidos no {@link pt.iade.carradio.models.daos.MusicDao} e apresenta-os na tabela que está na página {@link pt.iade.carradio.views.Songs.fxml}
 * @author ricardo.joaquim
 * @author bruno.flores
 *
 */
public class GenreController {

	/**
	 * Botão para regressar ao menu das playlists.
	 *
	 */
    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openPlaylistWindow();
    }
    /**
     * Botão para escolher outro utilizador.
     * @param event
     */
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
    
    /**
     * Método que vai buscar o valor do género clicado. Está static pois não é possível criar novos géneros, logo definimos os valores dos id's da base dados para cada género.
     * @return
     */
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
 	        
 	/**
 	 * Método que carrega os dados obtidos na tabela assim que a view é carregada.
 	 */
    @FXML
    private void initialize() {
	columnMusic.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeMusica()));
	columnArtist.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeArtista()));
	columnDuration.setCellValueFactory(new PropertyValueFactory<Music, Time>("Duracao"));
	musicTableByGenre.setItems(songsG);
    }

}
