package pt.iade.carradio.controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.daos.MusicDAO;

public class UserController {
    @FXML
    void onUser1(MouseEvent event) {
    	WindowManager.openMainMenuWindow();
    }

    @FXML
    void onUser2(MouseEvent event) {
    	MusicDAO.getMusics();
    }

    @FXML
    void onUser3(MouseEvent event) {

    }

	}


