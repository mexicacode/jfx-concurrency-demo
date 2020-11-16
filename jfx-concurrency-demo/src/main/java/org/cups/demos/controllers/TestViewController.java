package org.cups.demos.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TestViewController implements Initializable {

	@FXML
	public TextField txtTexto1;
	
	@FXML
	public TextField txtTexto2;
	
	@FXML
	public TextArea txtTextoUnion;
	
	@FXML
	public JFXButton btnIniciar;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
	}
	
	@FXML
	protected void iniciarDemo() {
		
		txtTextoUnion.appendText( txtTexto1.getText().trim() );
		txtTextoUnion.appendText( txtTexto2.getText().trim() );
		
	}

	public TextField getTxtTexto1() {
		return txtTexto1;
	}


	public TextField getTxtTexto2() {
		return txtTexto2;
	}


}
