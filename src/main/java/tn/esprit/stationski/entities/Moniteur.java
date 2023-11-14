package tn.esprit.stationski.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Moniteur  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate localDate;

    @OneToMany
    private Set<Cours> cours;



}
