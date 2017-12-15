package de.thm.swtp.studiplaner.backend;

import java.util.Date;

public class Modul {

    private String name;
    private String dozent;
    private String raum;
    private Date zeit;
    private int cp;
    private float note;

    public Modul(String name, String dozent, String raum, Date zeit, int cp, float note)
    {
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
        this.zeit=zeit;
        this.cp=cp;
        this.note=note;
    }

    public void setZeit(Date zeit) {
        this.zeit = zeit;
    }

    public Date getZeit() {
        return zeit;
    }

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

    public void EditModul(String name, String dozent, String raum, Date zeit, int cp, float note){
        this.name=name;
        this.dozent=dozent;
        this.raum=raum;
        this.zeit=zeit;
        this.cp=cp;
        this.note=note;
    }

}
