package de.thm.swtp.studiplaner;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("view/fxml/Main.fxml"));
			Scene scene = new Scene(root,1366,768);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setMaximized(true);
			primaryStage.setFullScreen(true);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
