package pt.iade.carradio.controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;

public class MainMenuController {
	
    @FXML
    void onGPS(MouseEvent event) {
    	WindowManager.openGPSWindow();
    }

    @FXML
    void onMusic(MouseEvent event) {

    }

    @FXML
    void onRadio(MouseEvent event) {
    	WindowManager.openRadioWindow();

    }

    @FXML
    void onPhone(MouseEvent event) {
    	WindowManager.openPhoneWindow();
    }
    @FXML
    void onUser(MouseEvent event) {
    	WindowManager.openUserWindow();
    }
	
}
