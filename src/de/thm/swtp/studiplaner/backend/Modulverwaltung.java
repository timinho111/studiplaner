package de.thm.swtp.studiplaner.backend;


import java.util.ArrayList;
import java.util.List;

public class Modulverwaltung {
    private List<Modul> modulliste=new ArrayList<Modul>();

    public Modulverwaltung(Modul... modul)
    {

        for (Modul m:modul)
        {
            this.modulliste.add(m);
        }

    }

    public Modulverwaltung(List<Modul> modulliste)
    {

        this.modulliste=modulliste;

    }

    public void DeleteModul(Modul m)
    {
        modulliste.remove(m);
    }

    public void AddModul(Modul m) { modulliste.add(m);}

}
