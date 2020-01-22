package pt.iade.carradio.controllers;

import java.io.FileInputStream;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import pt.iade.carradio.WindowManager;
import pt.iade.carradio.models.daos.MusicDAO;
/**
 * Classe que controla que utilizador foi escolhido.
 * @author ricardo.joaquim
 * @author bruno.flores
 */
public class UserController {
  
    private static int userClicked = 0;


    public static int getUserClicked() {
		return userClicked;
	}

	@FXML
    void onUser1(MouseEvent event) {
    	userClicked=1;
    	WindowManager.openMainMenuWindow();
    	}

    @FXML
    void onUser2(MouseEvent event) {
    	userClicked=2;
    	WindowManager.openMainMenuWindow();
    }

    @FXML
    void onUser3(MouseEvent event) {
    	userClicked=3;
    	WindowManager.openMainMenuWindow();
    }

	}


