package pt.iade.carradio;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import pt.iade.carradio.controllers.UtilizadorController;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		WindowManager.setPrimaryStage(primaryStage);
		WindowManager.openUserWindow();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}