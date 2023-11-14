package tn.esprit.stationski.resetController;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.Services.IMoniteur;

import tn.esprit.stationski.entities.Moniteur;


import java.util.List;

@RestController
@AllArgsConstructor
public class MoniteurResetController {

    @Autowired
    private IMoniteur iMoniteur;

    @PostMapping("/addMoniteur ")
    public Moniteur addMoniteur (@RequestBody Moniteur  moniteur)
    {
        return iMoniteur.addMoniteur (moniteur);
    }
    @PutMapping("/updateMoniteur ")
    public Moniteur  updateMoniteur (@RequestBody Moniteur  moniteur ){
        return iMoniteur.updateMoniteur (moniteur);
    }
    @GetMapping("/getAllMoniteur")

    public List<Moniteur > getAll(){
        return iMoniteur .getAllMoniteur();
    }
    @DeleteMapping("/deleteByIdMoniteur/{idMoniteur}")
    public void deleteById(@PathVariable long idMoniteur ) {

        iMoniteur .deleteMoniteur (idMoniteur );
    }

    @PostMapping("/addMoniteurAndAssignToCours/{numCours}")
    public Moniteur addMoniteurAndAssignToCours(@RequestBody Moniteur moniteur,@PathVariable long numCours){
        return iMoniteur.addMoniteurAndAssignToCours(moniteur, numCours);
    }

}
