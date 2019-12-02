package pt.iade.carradio.controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;

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
    
    //Abrir o Player
    @FXML
    void onPlayer(MouseEvent event) {
        	WindowManager.openPlayerWindow();
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
