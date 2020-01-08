package pt.iade.carradio.controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Playlist;
import pt.iade.carradio.models.daos.PlaylistDAO;

public class PlaylistController {
	
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
    void labelID(MouseEvent event) {
    	WindowManager.openPlayerWindow();
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
		
		// Abrir o Player carregando na Playlist
		playlistTV.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				WindowManager.openPlayerWindow();
			}
			
		});
		
	    }
	
}






