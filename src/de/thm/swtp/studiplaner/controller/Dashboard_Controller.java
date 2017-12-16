package de.thm.swtp.studiplaner.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import de.thm.swtp.studiplaner.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Dashboard_Controller implements Initializable{

    @FXML
    private ListView<String> listView;

    @FXML
    private ListView<String> listView1;

    @FXML
    private  ListView<String> listView2;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        listView.getItems().addAll(
                "1     08:00-09:30       Übung       Grafische Datenverarbeitung 1       B1 1.13",
                           "2     14:00-17:10       Vorlesung   Webanwendungen                      B2 3.11",
                           "6     17:10-18:50       Klausur     Grundlagen der Medientechnik        A4 U1.07"
        );

        listView1.getItems().addAll(
                "2     10:30-11:15       Projekt     SE                                  A3 U1.10",
                           "5     15:00-17:00       Projekt     AV                                  A4 1.21",
                           "5     17:20-18:50       Vorlesung   NG                                  A2 1.10"
        );

        listView2.getItems().addAll(
                "Testat PIA",
                "Prüfungsanmeldung BIS 10.12.2017",
                "DB nacharbeiten",
                "WSK Übung",
                "WAN Micro-CMS",
                "SE-Projekt",
                "GD1-Projekt");



    }
}
