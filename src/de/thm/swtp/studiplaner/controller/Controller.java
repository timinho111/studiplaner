package de.thm.swtp.studiplaner.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class Controller implements Initializable{
    @FXML
    private Label benutzer;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        benutzer.setText("Hallo BenutzerXYZ!");
    }
}
