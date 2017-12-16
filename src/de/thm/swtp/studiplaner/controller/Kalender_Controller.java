package de.thm.swtp.studiplaner.controller;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.sun.javafx.scene.control.skin.DatePickerContent;
import com.sun.javafx.scene.control.skin.DatePickerSkin;
import com.sun.prism.impl.Disposer.Record;

import de.thm.swtp.studiplaner.model.Termin;
import de.thm.swtp.studiplaner.model.editTable;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;

public class Kalender_Controller implements Initializable{

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
	TableView<Termin> tableTermin;
	
	@FXML
	TableColumn<Termin, String> tableDate;
	
	@FXML
	TableColumn<Termin, String> tableEntry;
	
	
	
	

	// DateCells einlesen
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
    	// Datum und Zeit formatieren
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
    	
    	// Kalender anzeigen
        DatePickerSkin datePickerSkin = new DatePickerSkin(new DatePicker(LocalDate.now()));
        DatePickerContent pop = (DatePickerContent)datePickerSkin.getPopupContent();
   	 	Node popupContent = datePickerSkin.getPopupContent();
   	 	bp.getChildren().add(popupContent);
   	 	
   	 	// Anchorpane einrichten
   	 	bp.setTopAnchor(popupContent, 100.0);
   	 	bp.setRightAnchor(popupContent, 100.0);
   	 	
   	 	// Daten zu Zellen zuweisen
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
        {	
        	// Liste der Termine erstellen
        	ObservableList<Termin> data = tableTermin.getItems();
        	// Tabelle der Liste zuweisen
        	tableTermin.setItems(data);
        	// Spaltenbezug herstellen
        	tableDate.setCellValueFactory(new PropertyValueFactory("Date"));
        	tableEntry.setCellValueFactory(new PropertyValueFactory("Entry"));
        	// Daten hinzufügen
        	data.add(new Termin(outputField.getText(), entryField.getText()));
        	// Felder leeren
        	outputField.clear();
        	entryField.clear();
        });
        
        // Callback für Editieren einrichten
    	Callback<TableColumn<Termin, String>, TableCell<Termin, String>> cellFactory =
                new Callback<TableColumn<Termin, String>, TableCell<Termin,String>>() {
                    public TableCell call(TableColumn p) {
                        return new editTable();
                    }
                };
        
        // Date bearbeiten
        tableDate.setCellFactory(cellFactory);
        tableDate.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Termin, String>>() {
                    @Override public void handle(TableColumn.CellEditEvent<Termin, String> t) {
                        ((Termin)t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDate(t.getNewValue());
                    }
                });
        // Entry bearbeiten
        tableEntry.setCellFactory(cellFactory);
        tableEntry.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Termin, String>>() {
                    @Override public void handle(TableColumn.CellEditEvent<Termin, String> t) {
                        ((Termin)t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDate(t.getNewValue());
                    }
                });
        
    }
}
