package tn.esprit.stationski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
