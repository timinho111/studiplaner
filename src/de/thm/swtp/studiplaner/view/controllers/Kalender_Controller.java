package de.thm.swtp.studiplaner.view.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.sun.javafx.scene.control.skin.DatePickerSkin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

public class Kalender_Controller implements Initializable{


	@FXML
	AnchorPane bp;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    	// Show Calendar
    	 DatePickerSkin datePickerSkin = new DatePickerSkin(new DatePicker(LocalDate.now()));
    	 Node popupContent = datePickerSkin.getPopupContent();
    	 bp.getChildren().add(popupContent); //added to anchorpane which already designed via scenebuilder


    }
}
