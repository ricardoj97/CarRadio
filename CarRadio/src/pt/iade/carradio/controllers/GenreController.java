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
 * Classe que controla os g�neros. Vai buscar os dados obtidos no {@link pt.iade.carradio.models.daos.MusicDao} e apresenta-os na tabela que est� na p�gina {@link pt.iade.carradio.views.Songs.fxml}
 * @author ricardo.joaquim
 * @author bruno.flores
 *
 */
public class GenreController {

	/**
	 * Bot�o para regressar ao menu das playlists.
	 *
	 */
    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openPlaylistWindow();
    }
    /**
     * Bot�o para escolher outro utilizador.
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
     * M�todo que vai buscar o valor do g�nero clicado. Est� static pois n�o � poss�vel criar novos g�neros, logo definimos os valores dos id's da base dados para cada g�nero.
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
 	 * M�todo que carrega os dados obtidos na tabela assim que a view � carregada.
 	 */
    @FXML
    private void initialize() {
	columnMusic.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeMusica()));
	columnArtist.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomeArtista()));
	columnDuration.setCellValueFactory(new PropertyValueFactory<Music, Time>("Duracao"));
	musicTableByGenre.setItems(songsG);
    }

}
