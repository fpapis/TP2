package tp2.baignoire;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Baignoire extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {

		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("Baignoire.fxml"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
