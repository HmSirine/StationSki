package tn.esprit.stationski.Services;

import tn.esprit.stationski.entities.Inscription;

import java.util.List;

public interface IInscription {

    public Inscription addInscription(Inscription inscription);
    public Inscription updateInscription(Inscription inscription);
    public List<Inscription> getAllInscription();
    public Inscription findByIdInscription(long numInscription);
    public void deleteInscription(long numInscription);


    public Inscription addInscriAndAssignToSkieur(Inscription inscription, long numSkieur);
    public  Inscription addInscriAndAssignToCours(Inscription inscription, long numCours);
}
