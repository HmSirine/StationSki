package tn.esprit.stationski.Services;

import tn.esprit.stationski.entities.Skieur;

import java.util.List;

public interface ISkieur {


    public Skieur addSkieur(Skieur skieur);
    public Skieur updateSkieur(Skieur skieur);
    public List<Skieur> getAllSkieur();
    public Skieur findById(long idSkieur);
    public void deleteSkieur(long numSkieur);

    public Skieur assignSkieurToPiste(long numSkieur,long numPiste);
}
