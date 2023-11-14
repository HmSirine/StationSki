package tn.esprit.stationski.Services;

import tn.esprit.stationski.entities.Moniteur;

import java.util.List;

public interface IMoniteur {

    public Moniteur addMoniteur(Moniteur moniteur);
    public Moniteur updateMoniteur(Moniteur moniteur);
    public List<Moniteur> getAllMoniteur();
    public Moniteur findById(long idMoniteur);
    public void deleteMoniteur(long idMoniteur);

    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur, long numCours);

}
