package de.thm.swtp.studiplaner.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Controller implements Initializable{


    @FXML
    private ListView<String> listView;
    @FXML
    private Button dashboard_button;
    @FXML
    private Button kalender_button;
    @FXML
    private Button module_button;
    @FXML
    private Button todo_button;
    @FXML
    private Button stundenplan_button;
    @FXML
    private Button mensaplan_button;
    @FXML
    private Button klausurplan_button;
    @FXML
    private Button noten_button;
    @FXML
    private Button login_button;




    @FXML
    private void ButtonAction(ActionEvent e) throws IOException
    {

    	
        Stage stage=new Stage();
        Parent root=FXMLLoader.load(getClass().getResource("Dashboard.fxml"));

        if(e.getSource()==login_button)
        {
            stage=(Stage) login_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        }

        if(e.getSource()==dashboard_button)
        {
            stage=(Stage) dashboard_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        }
        if(e.getSource()==kalender_button)
        {
            stage=(Stage) kalender_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("Kalender.fxml"));
        }
        if(e.getSource()==module_button)
        {
            stage=(Stage) module_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("Module.fxml"));
        }
        if(e.getSource()==todo_button)
        {
            stage=(Stage) todo_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("ToDo.fxml"));
        }
        if(e.getSource()==stundenplan_button)
        {
            stage=(Stage) stundenplan_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("Stundenplan.fxml"));
        }
        if(e.getSource()==klausurplan_button)
        {
            stage=(Stage) klausurplan_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("Klausurplan.fxml"));
        }

        if(e.getSource()==mensaplan_button)
        {
            stage=(Stage) mensaplan_button.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("Mensaplan.fxml"));
        }

        if(e.getSource()==noten_button)
        {
            stage=(Stage) noten_button.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("Noten.fxml"));
        }

        stage.getScene().setRoot(root);
        stage.show();

    }


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        //listView.getItems().addAll("termin 1","termin 2","termin 3");


    }
 }
