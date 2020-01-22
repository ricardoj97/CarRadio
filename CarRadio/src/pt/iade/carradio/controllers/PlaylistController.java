
package pt.iade.carradio.controllers;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Playlist;
import pt.iade.carradio.models.daos.PlaylistDAO;

/**
 * Classe que mostra os dados obtidos na {@link pt.iade.carradio.models.daos.PlaylistDAO}.
 * @author ricardo.joaquim
 * @author bruno.flores
 */
public class PlaylistController {
	
	private static int playlistClicked = 0;


    public static int getPlaylistClicked() {
		return playlistClicked;
	}

    @FXML
    private TableView<Playlist> playlistTV;

    @FXML
    private TableColumn<Playlist, String> playlistTC;

    @FXML
    private ImageView albumimg;

    @FXML
    private Label playlistName1;

    
    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openMainMenuWindow();
    }

    @FXML
    void onPlaylist(MouseEvent event) {
        	WindowManager.openPlayerWindow();
        }

    @FXML
    void onUser(MouseEvent event) {
    	WindowManager.openUserWindow();
    }

    @FXML
    void BtnHipHop(MouseEvent event) {
    	WindowManager.openSongsWindow();
    }
        
   private ObservableList<Playlist> playlists = PlaylistDAO.getPlaylists(UserController.getUserClicked());
       
	@FXML
   private void initialize() {
		
		playlistTC.setCellValueFactory(data -> new ReadOnlyStringWrapper(data.getValue().getNomePlaylist()));
		playlistTV.setItems(playlists);
		
/**
 * Método que valida que playlist foi selecionada para carregar as músicas corretas.
 */
		playlistTV.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				playlistClicked = playlistTV.getSelectionModel().getSelectedItem().getPlaylistID();
				WindowManager.openPlayerWindow();
			}
			
		});
		
	    }
	
}







