package tn.esprit.stationski.Services;

import tn.esprit.stationski.entities.Abonnement;
import tn.esprit.stationski.entities.Cours;

import java.util.List;

public interface IAbonnement {



    public Abonnement addAbonnement(Abonnement abonnement);
    public Abonnement updateAbonnement (Abonnement abonnement);
    public List<Abonnement> getAllAbonnement();
    public Abonnement findById(long numAbon);
    public void deleteAbonnement(long numAbon);
}
