package tn.esprit.stationski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Cours;
import tn.esprit.stationski.entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}
