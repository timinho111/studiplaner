package de.thm.swtp.studiplaner.controller;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.sun.javafx.scene.control.skin.DatePickerContent;
import com.sun.javafx.scene.control.skin.DatePickerSkin;

import de.thm.swtp.studiplaner.model.Termin;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class Kalender_Controller implements Initializable{

	// Kalender Instanz erstellen
	private List<Termin> terminliste = new ArrayList<Termin>();

	@FXML
	AnchorPane bp;
	
	@FXML
	TextField outputField;
	
	@FXML
	TextField entryField;
	
	@FXML
	Button saveButton;
	
	@FXML
	Button showButton;
	
	@FXML
	TextArea thisDay;

	// DateCells zuweisen
	private static List<DateCell> getAllDateCells(DatePickerContent content)
	{
     List<DateCell> result = new ArrayList<>();

     for (Node n : content.getChildren())
     {
         System.out.println("node " + n + n.getClass());
         if (n instanceof GridPane)
         {
             GridPane grid = (GridPane) n;
             for (Node gChild : grid.getChildren())
             {
                 System.out.println("grid node: " + gChild + gChild.getClass());
                 if (gChild instanceof DateCell)
                 {
                     result.add((DateCell) gChild);
                 }
             }
         }
     }

     return result;
	}      

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    	// Format DateTime
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
    	
    	// Show Calendar
        DatePickerSkin datePickerSkin = new DatePickerSkin(new DatePicker(LocalDate.now()));
        DatePickerContent pop = (DatePickerContent)datePickerSkin.getPopupContent();
   	 	Node popupContent = datePickerSkin.getPopupContent();
   	 	bp.getChildren().add(popupContent);
   	 	
   	 	// Resize bp
   	 	bp.setTopAnchor(popupContent, 100.0);
   	 	bp.setRightAnchor(popupContent, 100.0);
   	 	

        List<DateCell> dateCells = getAllDateCells(pop);

        for (DateCell cell : dateCells)
        {
            cell.addEventHandler(
                    MouseEvent.MOUSE_PRESSED,(e)->
                    {
                        outputField.setText(cell.getItem().format(formatter));
                    }
            );
        }
        
        saveButton.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->
        {	terminliste.add(new Termin(outputField.getText(), entryField.getText()));});
        
        showButton.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->
        { 
        	thisDay.clear();
        	
        	for (Termin t : terminliste) {
        	thisDay.appendText(t.toString() + "\n");;}
		    
		});

    }
}
