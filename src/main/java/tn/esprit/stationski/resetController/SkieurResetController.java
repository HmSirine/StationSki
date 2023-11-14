package tn.esprit.stationski.resetController;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.Services.ISkieur;
import tn.esprit.stationski.entities.Skieur;

import java.util.List;

@RestController
@AllArgsConstructor
public class SkieurResetController {

    @Autowired
    private ISkieur iSkieur;

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur s)
    {
        return iSkieur.addSkieur(s);
    }
    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur s){
        return iSkieur.updateSkieur(s);
    }
    @GetMapping("/getAllSkieur")
    public List<Skieur> getAll(){
        return iSkieur.getAllSkieur();
    }

    @DeleteMapping("/deleteByIdSkieur/{numSkieur}")
    public void deleteById(@PathVariable long numSkieur) {
        iSkieur.deleteSkieur(numSkieur);
    }

    @PostMapping("/addSkieurAndAssignToPiste/{numSkieur}/{numPiste}")
    public Skieur addSkieurAndAssignToPiste(@PathVariable long numSkieur,@PathVariable long numPiste){
        return iSkieur.assignSkieurToPiste(numSkieur, numPiste);
    }

}
