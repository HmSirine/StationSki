package tn.esprit.stationski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
