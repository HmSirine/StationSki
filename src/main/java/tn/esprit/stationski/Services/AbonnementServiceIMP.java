package tn.esprit.stationski.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.Repository.AbonnementRepository;
import tn.esprit.stationski.entities.Abonnement;

import java.util.List;

@Service
@AllArgsConstructor
public class AbonnementServiceIMP implements IAbonnement{

    @Autowired
    private AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement (Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement (Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public List<Abonnement> getAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement findById(long numAbon) {
        return abonnementRepository.findById(numAbon).orElse(null);
    }

    @Override
    public void deleteAbonnement(long numAbon) {
        abonnementRepository.deleteById(numAbon);

    }
}
