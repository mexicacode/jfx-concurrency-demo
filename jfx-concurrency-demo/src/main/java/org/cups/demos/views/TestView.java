package org.cups.demos.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestView extends Application {
	
	
	public void launchView(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(this.getClass().getResource("/test.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo Concurrency");
		primaryStage.setMaximized(true);
		primaryStage.show();
		
	}

	
	
}
