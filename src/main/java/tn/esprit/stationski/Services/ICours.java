package tn.esprit.stationski.Services;

import tn.esprit.stationski.entities.Cours;


import java.util.List;

public interface ICours {


    public Cours addCours(Cours cours);
    public Cours updateCours(Cours cours);
    public List<Cours> getAllCours();
    public Cours findById(long idCours);
    public void deleteCours(long numCours);


}
