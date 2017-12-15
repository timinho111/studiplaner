package de.thm.swtp.studiplaner.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import de.thm.swtp.studiplaner.model.Modul;
import de.thm.swtp.studiplaner.model.Modulverwaltung;
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
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class Module_Controller implements Initializable{

    ObservableList<Modul> module_object;
    ObservableList<String> module;

    @FXML
    private  Label modulueberschrift;

    @FXML
    private Button modul_add;

    @FXML
    private Button modul_remove;

    @FXML
    private TextField bezeichnung;

    @FXML
    private TextField dozent;

    @FXML
    private TextField raum;

    @FXML
    private TextField vorlesungsdatum;

    @FXML
    private TextField note;

    @FXML
    private TextField creditpoints;

    @FXML
    private TextArea notizen;

    @FXML
    private ComboBox<String> modulauswahl;

    @FXML
    private Button speichern_bezeichnung;

    @FXML
    private Button speichern_dozent;

    @FXML
    private Button speichern_raum;

    @FXML
    private Button speichern_vorlesungsdatum;

    @FXML
    private Button speichern_creditpoints;

    @FXML
    private Button speichern_note;

    @FXML
    private Button speichern_notizen;

    @FXML
    private Button loeschen_bezeichnung;

    @FXML
    private Button loeschen_dozent;

    @FXML
    private Button loeschen_raum;

    @FXML
    private Button loeschen_vorlesungsdatum;

    @FXML
    private Button loeschen_creditpoints;

    @FXML
    private Button loeschen_note;

    @FXML
    private Button loeschen_notizen;

    @FXML
    protected void SaveButtonAction(ActionEvent event)
    {
        if(event.getSource()==speichern_bezeichnung)
        {
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setName(bezeichnung.getText());
                    bezeichnung.setText(m.getName());
                }
            }
        }

        if(event.getSource()==speichern_dozent)
        {
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setDozent(dozent.getText());
                    dozent.setText(m.getDozent());
                }
            }
        }

        if(event.getSource()==speichern_raum)
        {
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setRaum(raum.getText());
                    raum.setText(m.getRaum());
                }
            }
        }

        if(event.getSource()==speichern_vorlesungsdatum)
        {
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setZeit(vorlesungsdatum.getText());
                    vorlesungsdatum.setText(m.getZeit());
                }
            }
        }

        if(event.getSource()==speichern_creditpoints)
        {
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setCp(new IntegerStringConverter().fromString(creditpoints.getText()));
                    creditpoints.setText(new IntegerStringConverter().toString(m.getCp()));
                }
            }
        }

        if(event.getSource()==speichern_note)
        {
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setNote(new FloatStringConverter().fromString(note.getText()));
                    note.setText(new FloatStringConverter().toString(m.getNote()));
                }
            }
        }

        if(event.getSource()==speichern_notizen)
        {
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setNotizen(notizen.getText());
                    notizen.setText(m.getNotizen());
                }
            }
        }
    }

    @FXML
    protected void AddModul (ActionEvent event) throws IOException
    {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("de/thm/swtp/studiplaner/view/fxml/Modul_Dialog.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void DeleteModul(ActionEvent event)
    {
        if(event.getSource()==modul_remove)
        {
            for (Modul m: module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    modulauswahl.getItems().clear();
                    module_object.remove(m);
                    module.remove(m.getName());
                    modulauswahl.getItems().addAll(module);

                    modulauswahl.getSelectionModel().selectFirst();
                }
            }
        }



        }



    @FXML
    protected  void DeleteButtonAction(ActionEvent event)
    {

        if(event.getSource()==loeschen_dozent)
        {
            dozent.clear();
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setDozent("Leer");
                }
            }
            dozent.setText("Leer");
        }

        if(event.getSource()==loeschen_raum)
        {
            raum.clear();
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setRaum("Leer");
                }
            }
            raum.setText("Leer");

        }

        if(event.getSource()==loeschen_vorlesungsdatum)
        {
            vorlesungsdatum.clear();
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setZeit("Leer");
                }
            }
            vorlesungsdatum.setText("Leer");
        }

        if(event.getSource()==loeschen_creditpoints)
        {
            creditpoints.clear();
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setCp(0);
                }
            }
            creditpoints.setText("Leer");
        }

        if(event.getSource()==loeschen_note)
        {
            note.clear();
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                    m.setNote(0);
                }
            }
            note.setText("Leer");
        }

        if(event.getSource()==loeschen_notizen)
        {
            notizen.clear();
            for (Modul m:module_object)
            {
                if(m.getName()==modulauswahl.getSelectionModel().getSelectedItem())
                {
                   m.setNotizen("Leer");
                }
            }
            note.setText("Leer");
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {


      Modul modul1=new Modul("Modulname1", "Dozent1", "A1","08:00", 5, 1.2F, "HALLO WELT! ICH BIN MODUL1");
        Modul modul2=new Modul("Modulname2", "Dozent1", "B2","09:45", 6);
        Modul modul3=new Modul("Modulname3", "Dozent1", "C3","11:30", 7, 2.2F);
        Modul modul4=new Modul("Modulname4", "Dozent1", "A5","14:00", 8, 5.0F, "HALLO WELT! ICH BIN MODUL4");
        Modul modul5=new Modul("Modulname5", "Dozent1", "B7","15:40", 4, 4.0F, "HALLO WELT! ICH BIN MODUL5");
        List<String> modulliste;
        Modulverwaltung modulverwaltung=new Modulverwaltung(modul1,modul2,modul3,modul4,modul5);


        module_object=FXCollections.observableArrayList(modul1,modul2,modul3,modul4,modul5);
        module= FXCollections.observableArrayList(modul1.getName(),modul2.getName(),modul3.getName(),modul4.getName(),modul5.getName());

        modulauswahl.setPromptText("Modul auswählen");
        modulauswahl.getItems().addAll(module);



        modulauswahl.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) ->{
                if(newValue!=null)
    {
        for (Modul m:module_object) {
            if(newValue==m.getName())
            {
                if(m.getName()!=null)bezeichnung.setText(m.getName()); else bezeichnung.setText("Leer");
                modulueberschrift.setText(m.getName());
                if(m.getDozent()!= null)dozent.setText(m.getDozent()); else dozent.setText("Leer");
                if(m.getRaum()!= null)raum.setText(m.getRaum()); else dozent.setText("Leer");
                if(m.getZeit()!= null)vorlesungsdatum.setText(m.getZeit()); else vorlesungsdatum.setText("Leer");
                if(m.getCp()!= 0)creditpoints.setText(new IntegerStringConverter().toString(m.getCp())); else creditpoints.setText("Leer");
                if(m.getNote()!=0) note.setText(new FloatStringConverter().toString(m.getNote())); else note.setText("Leer");
                if(m.getNotizen()!=null) notizen.setText(m.getNotizen()); else notizen.setText("Leer");

            }
        }
    }

        });


    }
}
