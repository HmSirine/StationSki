package tn.esprit.stationski.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.Repository.CoursRepository;
import tn.esprit.stationski.entities.Cours;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursServiceIMP implements ICours{

    private CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours findById(long idCours) {
        return coursRepository.findById(idCours).orElse(null);
    }

    @Override
    public void deleteCours(long numCours) {
      coursRepository.deleteById(numCours);
    }
}
