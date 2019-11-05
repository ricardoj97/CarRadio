package pt.iade.carradio.controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;

public class MainMenuController {
	
    @FXML
    void onGPS(MouseEvent event) {
    	System.out.println("GPS");
    }

    @FXML
    void onMusic(MouseEvent event) {

    }

    @FXML
    void onRadio(MouseEvent event) {

    }

    @FXML
    void onPhone(MouseEvent event) {

    }
    @FXML
    void onUser(MouseEvent event) {
    	WindowManager.openUserWindow();
    }
	
}
