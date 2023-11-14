package tn.esprit.stationski.resetController;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.Services.IInscription;
import tn.esprit.stationski.entities.Inscription;

import java.util.List;

@RestController
@AllArgsConstructor
public class InscriptionResetController {

    private IInscription iInscription;

    @PostMapping("/addInscri")
    public Inscription addInscription(@RequestBody Inscription inscription){
        return iInscription.addInscription(inscription);

    }

    @PutMapping("/updateSki")
    public Inscription updateInscription(@RequestBody Inscription inscription){
        return iInscription.updateInscription(inscription);

    }

    @GetMapping("/getAllInscri")
    public List<Inscription> getAllInscription(){
        return iInscription.getAllInscription();
    }
    @GetMapping("/findByIdInscri/{numInscription}")
    public Inscription findById(@PathVariable long numInscription){
        return iInscription.findByIdInscription( numInscription);
    }




    @PostMapping("/addAssingToSkieur/{numSkieur}")
    public Inscription addInscriAndAssignToSkieur(@RequestBody Inscription inscription, @PathVariable long numSkieur){
        return iInscription.addInscriAndAssignToSkieur(inscription, numSkieur);
    }

    @PostMapping("/addAssingToCours/{numCours}")
    public Inscription addInscriAndAssignToCours(@RequestBody Inscription inscription,@PathVariable long numCours){
        return iInscription.addInscriAndAssignToCours(inscription, numCours);
    }
}
