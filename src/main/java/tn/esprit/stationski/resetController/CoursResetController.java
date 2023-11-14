package tn.esprit.stationski.resetController;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.Services.ICours;
import tn.esprit.stationski.Services.ISkieur;
import tn.esprit.stationski.entities.Cours;
import tn.esprit.stationski.entities.Skieur;

import java.util.List;

@RestController
@AllArgsConstructor
public class CoursResetController {


    @Autowired
    private ICours iCours;
    @PostMapping("/addCours")
        public Cours addCours(@RequestBody Cours cours)
    {

        return iCours.addCours(cours);
    }
    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours){
        return iCours.updateCours(cours);
    }
    @GetMapping("/getAllCours")

    public List<Cours> getAll(){
        return iCours.getAllCours();
    }
    @DeleteMapping("/deleteByIdCours/{idCours}")
    public void deleteById(@PathVariable long numCours) {

        iCours.deleteCours(numCours);
    }

}
