package tn.esprit.stationski.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.Repository.PisteRepository;
import tn.esprit.stationski.Repository.SkieurRepository;
import tn.esprit.stationski.entities.Piste;
import tn.esprit.stationski.entities.Skieur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SkieurServiceIMP implements ISkieur{

    private SkieurRepository skieurRepository;
    private PisteRepository pisteRepository;
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur findById(long idSkieur) {
        return skieurRepository.findById(idSkieur).orElse(null);
    }

    @Override
    public void deleteSkieur(long numSkieur) {
        skieurRepository.deleteById(numSkieur);

    }

    @Override
    public Skieur assignSkieurToPiste(long numSkieur, long numPiste) {

        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        try {
            skieur.getPistes().add(piste);
        }catch (NullPointerException exception){
            Set<Piste> pisteSet = new HashSet<>(); //liste fergha
            pisteSet.add(piste); //aabineha b liste mte pisteSet
            skieur.setPistes(pisteSet); // j'affecte skieur lel piste
        }

        return skieurRepository.save(skieur);
    }
}