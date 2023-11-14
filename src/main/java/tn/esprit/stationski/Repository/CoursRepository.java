package tn.esprit.stationski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
