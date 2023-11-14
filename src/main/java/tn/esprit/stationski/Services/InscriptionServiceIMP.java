package tn.esprit.stationski.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.Repository.CoursRepository;
import tn.esprit.stationski.Repository.InscriptionRepository;
import tn.esprit.stationski.Repository.SkieurRepository;
import tn.esprit.stationski.entities.Cours;
import tn.esprit.stationski.entities.Inscription;
import tn.esprit.stationski.entities.Skieur;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceIMP implements IInscription{

    @Autowired
   private InscriptionRepository inscriptionRepository;
    @Autowired
    private SkieurRepository skieurRepository;
    @Autowired
    private CoursRepository coursRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public List<Inscription> getAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription findByIdInscription(long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(long numInscription) {
        inscriptionRepository.deleteById(numInscription);

    }
    //Trouver L'inscription par l'id de skieur
    @Override
    public Inscription addInscriAndAssignToSkieur(Inscription inscription, long numSkieur) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        inscription.setSkieurs(skieur);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription addInscriAndAssignToCours(Inscription inscription, long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }
}
