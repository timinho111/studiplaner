package de.thm.swtp.studiplaner.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import de.thm.swtp.studiplaner.model.Stundenplan;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;


public class Stundenplan_Controller implements Initializable{

    @FXML
    private TableView table;

    @FXML
    private TableColumn uhrzeit;

    @FXML
    private TableColumn montag;

    @FXML
    private TableColumn dienstag;

    @FXML
    private TableColumn mittwoch;

    @FXML
    private TableColumn donnerstag;

    @FXML
    private TableColumn freitag;

    @FXML
    private TableColumn samstag;

    @FXML
    private TableColumn sonntag;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        ObservableList<Stundenplan> data= FXCollections.observableArrayList(
                new Stundenplan("08:00-09:30", "DB", "GD", "", "PIA UEBUNG", "","",""),
                new Stundenplan("09:45-11:15", "DB", "WSK", "LA", "NG", "","",""),
                new Stundenplan("11:30-13:00", "DB UEBUNG", "WSK", "LA UEBUNG", "PIA", "","",""),
                new Stundenplan("14:00-15:30","", "NG UEBUNG", "","", "PG","",""),
                new Stundenplan("15:40-17:10", "", "", "", "PG UEBUNG", "","",""),
                new Stundenplan("17:20-18:50", "NG", "", "", "", "","",""),
                new Stundenplan("19:30-20:30", "", "", "", "", "","",""));

        uhrzeit.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("uhrzeit")
        );
        montag.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("montag")
        );
        dienstag.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("dienstag")
        );
        mittwoch.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("mittwoch")
        );
        donnerstag.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("donnerstag")
        );
        freitag.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("freitag")
        );
        samstag.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("samstag")
        );
        sonntag.setCellValueFactory(
                new PropertyValueFactory<Stundenplan, String>("sonntag")
        );
        table.setItems(data);
        //table.getColumns().addAll(uhrzeit,montag,dienstag,mittwoch,donnerstag,freitag,samstag,sonntag);


    }
}

