package pt.iade.carradio.controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.models.Playlist;
import pt.iade.carradio.models.daos.DBConnector;
import pt.iade.carradio.models.daos.MusicDAO;
import pt.iade.carradio.models.daos.PlaylistDAO;

public class PlaylistController {
	
    @FXML
    private GridPane playlistgrid;

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
    
    private int playlistID;
    private ObservableList<Playlist> playlists = PlaylistDAO.getPlaylists(playlistID);
    
    private EventHandler<? super MouseEvent> labelID;
	@FXML
   private void initialize() {
		
		 for ( playlistID= 0; playlistID <= 3; playlistID++) {
				 for (int row = 0; playlistID <= 3; row++) {
				Label label = new Label(Playlist.getNomePlaylist());
	            label.setMinHeight(25);
	            label.prefHeight(25);
	            label.setMaxHeight(25);
	            label.setOnMouseClicked(labelID);
	            
				playlistgrid.addRow(row, new Label(Playlist.getNomePlaylist()));
	            playlistID++;
	            
	            PlaylistDAO.getPlaylists(playlistID);
	            	System.out.println(playlistID);
	            	System.out.println(Playlist.getNomePlaylist());
					 
	   			 }

	        }
	        
	    }

    }





