package tn.esprit.stationski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
