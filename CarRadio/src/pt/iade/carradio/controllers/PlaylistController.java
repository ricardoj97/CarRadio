package pt.iade.carradio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Playlist;

public class PlaylistController {
	private Playlist playlist;
	


    @FXML
    private GridPane xd;

    @FXML
    private ColumnConstraints col1;

    @FXML
    private RowConstraints row0;

    @FXML
    private RowConstraints row1;

    @FXML
    private RowConstraints row2;

    @FXML
    private ImageView albumimg;

    @FXML
    private Label playlistName;

    @FXML
    void onHomeButton(MouseEvent event) {

    }

    @FXML
    void onPlayer(MouseEvent event) {

    }

    @FXML
    void onUser(MouseEvent event) {

    }
    
   
    
//	public PlaylistController() {
//		this.playlist = playlist;
//	}
//    
//	@FXML
//    private void initialize() {
//		playlistName.setText(playlist.getName());
//    }
}
