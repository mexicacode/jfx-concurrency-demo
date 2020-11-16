package org.cups.demos.views;

import org.cups.demos.controllers.TestViewController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestView extends Application {
	
	private static TestViewController controller;
	
	public static TestViewController getController() {
		return controller;
	}


	public static void setController(TestViewController controller) {
		TestView.controller = controller;
	}


	public void launchView(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Se instancia el cargador de FXML
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/test.fxml"));
		
		
		Parent root = loader.load();		//Se carga el arbol de elementos del FXML en un Parent
		Scene scene = new Scene(root);		//Se crea una escena con dicho arbol
		primaryStage.setScene(scene);		//Se coloca la escena en el escenario
		primaryStage.setTitle("Demo Concurrency");
		primaryStage.setMaximized(true);
		primaryStage.show();
		
		//Se recupera el controlador
		controller = (TestViewController) loader.getController();
		
	}
	
	
	
}
