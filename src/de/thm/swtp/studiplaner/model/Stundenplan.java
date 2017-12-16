package de.thm.swtp.studiplaner.model;

import javafx.beans.property.SimpleStringProperty;

public class Stundenplan {
    private SimpleStringProperty uhrzeit;
    private SimpleStringProperty montag;
    private SimpleStringProperty dienstag;
    private SimpleStringProperty mittwoch;
    private SimpleStringProperty donnerstag;
    private SimpleStringProperty freitag;
    private SimpleStringProperty samstag;
    private SimpleStringProperty sonntag;

    public String getUhrzeit() {
        return uhrzeit.get();
    }

    public SimpleStringProperty uhrzeitProperty() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit.set(uhrzeit);
    }

    public String getMontag() {
        return montag.get();
    }

    public SimpleStringProperty montagProperty() {
        return montag;
    }

    public void setMontag(String montag) {
        this.montag.set(montag);
    }

    public String getDienstag() {
        return dienstag.get();
    }

    public SimpleStringProperty dienstagProperty() {
        return dienstag;
    }

    public void setDienstag(String dienstag) {
        this.dienstag.set(dienstag);
    }

    public String getMittwoch() {
        return mittwoch.get();
    }

    public SimpleStringProperty mittwochProperty() {
        return mittwoch;
    }

    public void setMittwoch(String mittwoch) {
        this.mittwoch.set(mittwoch);
    }

    public String getDonnerstag() {
        return donnerstag.get();
    }

    public SimpleStringProperty donnerstagProperty() {
        return donnerstag;
    }

    public void setDonnerstag(String donnerstag) {
        this.donnerstag.set(donnerstag);
    }

    public String getFreitag() {
        return freitag.get();
    }

    public SimpleStringProperty freitagProperty() {
        return freitag;
    }

    public void setFreitag(String freitag) {
        this.freitag.set(freitag);
    }

    public String getSamstag() {
        return samstag.get();
    }

    public SimpleStringProperty samstagProperty() {
        return samstag;
    }

    public void setSamstag(String samstag) {
        this.samstag.set(samstag);
    }

    public String getSonntag() {
        return sonntag.get();
    }

    public SimpleStringProperty sonntagProperty() {
        return sonntag;
    }

    public void setSonntag(String sonntag) {
        this.sonntag.set(sonntag);
    }



    public Stundenplan(String uhrzeit, String montag, String dienstag, String mittwoch, String donnerstag, String freitag, String samstag, String sonntag)
    {
        this.uhrzeit=new SimpleStringProperty(uhrzeit);
        this.montag=new SimpleStringProperty(montag);
        this.dienstag=new SimpleStringProperty(dienstag);
        this.mittwoch=new SimpleStringProperty(mittwoch);
        this.donnerstag=new SimpleStringProperty(donnerstag);
        this.freitag=new SimpleStringProperty(freitag);
        this.samstag=new SimpleStringProperty(samstag);
        this.sonntag=new SimpleStringProperty(sonntag);
    }







}
