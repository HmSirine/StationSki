package tn.esprit.stationski.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.Repository.CoursRepository;
import tn.esprit.stationski.Repository.MoniteurRepository;
import tn.esprit.stationski.entities.Cours;
import tn.esprit.stationski.entities.Moniteur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class MoniteurServiceIMP implements IMoniteur{

    private MoniteurRepository moniteurRepository;
    private CoursRepository coursRepository;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> getAllMoniteur() {
        return  moniteurRepository.findAll();
    }

    @Override
    public Moniteur findById(long idMoniteur) {
        return  moniteurRepository.findById(idMoniteur).orElse(null);
    }

    @Override
    public void deleteMoniteur(long idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);

    }

    @Override
    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur, long numCours) {
        Cours cours= coursRepository.findById(numCours).orElse(null);
        Set<Cours> coursSet = new HashSet<>();
        coursSet.add(cours);
        moniteur.setCours(coursSet);

        return moniteurRepository.save(moniteur);
    }
}
