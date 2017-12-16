package de.thm.swtp.studiplaner.model;

import java.text.DateFormat;
import java.util.Date;

public class Modul {

    private String name;
    private String dozent;
    private String raum;
    private String zeit;
    private int cp;
    private float note;
    private String notizen;

    public Modul(String name, String dozent, String raum, String zeit, int cp, float note, String notizen)
    {
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
        this.zeit=zeit;
        this.cp=cp;
        this.note=note;
        this.notizen=notizen;
    }

    public Modul(String name, String dozent, String raum, String zeit, int cp, float note)
    {
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
        this.zeit=zeit;
        this.cp=cp;
        this.note=note;
    }

    public Modul(String name, String dozent, String raum, String zeit, int cp)
    {
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
        this.zeit=zeit;
        this.cp=cp;
    }

    public Modul(String name, String dozent, String raum, String zeit)
    {
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
        this.zeit=zeit;

    }

    public Modul(String name, String dozent, String raum)
    {
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
    }

    public Modul(String name, String dozent)
    {
        this.name=name;
        this.dozent=dozent;
    }

    public Modul(String name)
    {
        this.name=name;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }

    public String getZeit() {return zeit; }

    public void setNote(float note) {
        this.note = note;
    }

    public float getNote() {
        return note;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getCp() {
        return cp;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public String getDozent() {
        return dozent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public String getRaum() {
        return raum;
    }

    public void setNotizen(String notizen){this.notizen=notizen;}

    public String getNotizen(){ return notizen;}

    public void EditModul(String name, String dozent, String raum, String zeit, int cp, float note){
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
        this.zeit=zeit;
        this.cp=cp;
        this.note=note;
    }

}
