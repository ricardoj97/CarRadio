package pt.iade.carradio.controllers;

import java.sql.Time;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.Music;

/**
 * Classe que controla o menu principal.
 * @author ricardo.joaquim
 *
 */
public class MainController {
	//Abrir GPS
    @FXML
    void onGPS(MouseEvent event) {
    	WindowManager.openGPSWindow();
    }
    
  //Abrir Página Playlists
    @FXML
    void onMusic(MouseEvent event) {
    	WindowManager.openPlaylistWindow();
    }

  //Abrir Radio
    @FXML
    void onRadio(MouseEvent event) {
    	WindowManager.openRadioWindow();

    }
    
  //Abrir Telefone
    @FXML
    void onPhone(MouseEvent event) {
    	WindowManager.openPhoneWindow();
    }
    

    
    
    //Voltar ao ecrã para escolher o utilizador
    @FXML
    void onUser(MouseEvent event) {
    	WindowManager.openUserWindow();
    }
    
    //Voltar ao menu principal
    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openMainMenuWindow();
    }
    


}
