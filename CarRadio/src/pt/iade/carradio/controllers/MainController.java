package pt.iade.carradio.controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;

public class MainController {
    @FXML
    void onHomeButton(MouseEvent event) {
    	WindowManager.openMainMenuWindow();
    }

}