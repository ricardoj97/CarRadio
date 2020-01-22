package pt.iade.carradio;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import pt.iade.carradio.controllers.UserController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 * Classe que inicializa o programa.
 * @author ricardo.joaquim
 * @author bruno.flores
 */
public class Main extends Application {
	/**
	 * Método que inicializa a janela inicial.
	 */
	@Override
	public void start(Stage primaryStage) {
		WindowManager.setPrimaryStage(primaryStage);
		WindowManager.openUserWindow();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}