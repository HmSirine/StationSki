package tn.esprit.stationski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Piste implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long numPiste;
    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longeur;
    private int pente;

    @ManyToMany
    @JsonIgnore
    private Set<Skieur> skieurs;

}

