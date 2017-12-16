package de.thm.swtp.studiplaner.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import de.thm.swtp.studiplaner.model.Modul;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.collections.FXCollections;

public class Modul_Dialog_Controller implements Initializable{

/*

    private ObservableList<Modul> module_object_child=FXCollections.observableArrayList();
    private ObservableList<String> module_child=FXCollections.observableArrayList();

    public ObservableList<Modul> GetModule_object_child()
    {
        return module_object_child;
    }

    public ObservableList<String> getModule_child() {
        return module_child;
    }

    @FXML
    private TextField add_bezeichnung;

    @FXML
    private TextField add_dozent;

    @FXML
    private TextField add_raum;

    @FXML
    private TextField add_vorlesungsdatum;

    @FXML
    private TextField add_creditpoints;

    @FXML
    private TextField add_note;

    @FXML
    private Button add_save;

    @FXML
    private Button add_reset;

    @FXML
    protected void Add_SaveButtonAction(ActionEvent event)
    {

           FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/thm/swtp/studiplaner/view/fxml/Module.fxml"));


           Module_Controller module_controller = loader.getController();
           int creditpoints=add_creditpoints.getText()!=null?new IntegerStringConverter().fromString(add_creditpoints.getText()):0;
           float note=add_note.getText()!=null?new FloatStringConverter().fromString(add_note.getText()):0;

           Modul m=new Modul(
                   add_bezeichnung.getText(),
                   add_dozent.getText(),
                   add_raum.getText(),
                   add_vorlesungsdatum.getText(),
                   creditpoints,
                   note);
    module_controller.addItem(m);

    Stage stage = (Stage) add_save.getScene().getWindow();
    stage.close();




           //module_object_child.add(m);
           //module_child.add(m.getName());

           //Stage stage = (Stage) add_save.getScene().getWindow();
           //stage.close();

        //module_controller.setModule(module_child);
        //module_controller.setModule_object(module_object_child);
        //modulauswahl.getItems().add(m.getName());
        //modulauswahl.getSelectionModel( ).selectFirst();


        //modulauswahl.getItems().clear();
        //modulauswahl.getItems().addAll(module);

    }
    @FXML
    protected void Add_DeleteButtonAction(ActionEvent event)
    {
        add_bezeichnung.clear();
        add_dozent.clear();
        add_raum.clear();
        add_vorlesungsdatum.clear();
        add_creditpoints.clear();
        add_note.clear();
    }*/
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {


    }
}

